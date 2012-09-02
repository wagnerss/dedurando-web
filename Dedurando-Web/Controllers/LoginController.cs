using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Core.UserServiceService;

namespace Core.Controllers
{
    public class LoginController : Controller{
        
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
             service.signIn(user);
            return View("_Login");
        }


    }
}
