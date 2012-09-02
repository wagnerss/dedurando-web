using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Core.UserServiceService;


namespace Core.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            //ViewBag.Message = "Modify this template to kick-start your ASP.NET MVC application.";

            //UserServiceClient service = new UserServiceClient();
            //User user = new User();
            //user.mail = "davi555.psr@gmail.com";
            //user.firstName ="Davi Paulo";
            //user.lastName ="Simao Ruiz";
            //user.password = "1234";
            //user.ipAddress = "192.168.7.20";
            //user = service.register(user);
            //service.findAll(user);
            return View();
        }

        public ActionResult About()
        {
            ViewBag.Message = "Your app description page.";

            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "Your contact page.";

            return View();
        }
    }
}
