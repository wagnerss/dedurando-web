using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Core.UserServiceService;
using System.ServiceModel;

namespace Core.Controllers
{
    public class LoginController : Controller {
        
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Register(User user){

            UserServiceClient service = new UserServiceClient();
            service.register(user);
            return View("_RegisterUser");
        }

        //public ActionResult Login(User user){

        //    UserServiceClient service = new UserServiceClient();
        //    User userSign = new User();
        //    //Arrumar no webservice !!!
        //    userSign = service.findByEmailAndPassword(user);
        //    //userSign = service.find(user);
        //    //service.signIn(userSign);
        //    return View("_RegisterUser");
        //}



        public ActionResult SignIn(User user){
            UserServiceClient service = new UserServiceClient();
            try{
                Session["currentUser"] = service.signIn(user);
            }catch(Exception ex) {
                throw new FaultException("Usuario ou senha invalido |" +ex);
            }
            
            return RedirectToAction("Index","Post");
        }

        public ActionResult SignOut(User user){
            UserServiceClient service = new UserServiceClient();
            try
            {
                Session["currentUser"] = null;
            }
            catch (Exception ex)
            {
                throw new FaultException("Usuario nao possui sessao ativa |" + ex);
            }

            return RedirectToAction("Index", "Home");
        }

        public ActionResult ConfirmEmail(string tolken)
        {
            UserServiceClient service = new UserServiceClient();
            try{
                
               // Session["currentUser"] = service.confirmEmail(tolken);
            }
            catch (Exception ex)
            {
                throw new FaultException("Usuario nao possui sessao ativa |" + ex);
            }

            return View("_Login");
        }


    }
}
