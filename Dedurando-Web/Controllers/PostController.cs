using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Core.PostReference;

namespace Core.Controllers
{
    public class PostController : Controller{

        public ActionResult Index(){
            return View();
        }



        //public ActionResult AddPost(Core.Models.Post model) {

            //PostServiceClient service = new PostServiceClient();
          
            //Post p = new Post();
            
            //p.createdAt = new DateTime();
            //p.item = new Item() { name = "0", itemId = 0, category = new Category() { categoryId = 1, name = "categoria", status = 1 } };
            //p.user = new User()
            //{
            //    city = "Sao Paulo",
            //    country = "local",
            //    firstName = "Milton",
            //    lastName = "Quirino",
            //    mail = "milton@milton.com",
            //    userId = 0,
            //    confirmation_token = "",
            //    password = ""
            //};
            //p.place = new Place() { city = "Sampa", name = "teste", placeId = 1 };
            //p.legend = "teste de post";


            //service.save(p);
            //return View("Index");
        //}











        //public ActionResult Post(){

        //    Post p = new Post();
        //    p.createdAt = new DateTime();
        //    p.item = new Item() { name = "0", itemId = 0, category = new Category() {  categoryId=1, name="categoria",status = 1} };
        //    p.user = new User() { city = "Sao Paulo", country = "local", firstName= "Milton", lastName= "Quirino", mail =  "milton@milton.com", userId= 0, confirmation_token = "",
        //     password= ""};
        //    p.place = new Place() { city = "Sampa", name = "teste", placeId = 1 };
        //    p.legend = "teste de post";
        //    //p.photo = new byte[] { };
        //    p.post = new List<Post>{};
        //    Post post = new Post();
        //    post.post = new List<Models.Post>();
        //    post.post.Add(p);
        //    post.post.Add(p);
        //    return View("_Post", post);
        //}
        



    }
}
