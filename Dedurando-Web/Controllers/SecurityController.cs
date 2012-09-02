using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Core.Controllers
{
    public class SecurityController : Controller
    {



        protected override void OnAuthorization(AuthorizationContext filterContext)
        {
            

            
            base.OnAuthorization(filterContext);
            if (Session != null)
            {
                if (Session["currentUser"] == null)
                {
                    filterContext.Result = RedirectToAction("Index", "Login");
                    //Redirect("http://localhost:1234/login");
                    //RedirectToAction("Index", "LoginController");
                   // Url.Action("Index", "LoginController");
                }

            }
            else
            {
                RedirectToAction("Index", "Login");
            }
        }



    }
}