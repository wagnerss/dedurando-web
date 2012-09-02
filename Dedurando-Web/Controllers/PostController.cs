using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Core.PostReference;

namespace Core.Controllers
{
    public class PostController : SecurityController{

        public ActionResult Index(){
            PostServiceClient service = new PostServiceClient();

            List<Post> posts = service.findAll().ToList();
            
            return View("_post", posts);
        }

        public ActionResult RedirectToIndex() {
            return View("_FindPost");
        }

        public ActionResult FindPost(){
            return PartialView("_FindPost");
        }

        public ActionResult New()
        {
            return View();
        }

        public ActionResult Save(Post post) {
            PostServiceClient service = new PostServiceClient();
            service.save(post);
            return RedirectToAction("FindPost");
        }

        public ActionResult FindById(Post post)
        {
            PostServiceClient service = new PostServiceClient();
            
            service.find(post);
            return View();
        }

        //
        public ActionResult FindByLegend(Post post){
            PostServiceClient service = new PostServiceClient();
            //Davi ira fazer o metodo 
            //service.findByLegend(post);
            return PartialView("_FindPost");
        }

        public ActionResult FindByLatLong(Post post)
        {
            PostServiceClient service = new PostServiceClient();
            //Davi ira fazer o metodo 
            service.findAllByLatitudeAndLongitude(post);
            return View();
        }

        //alterar o status para desativo
        public ActionResult Delete(Post post){
            PostServiceClient service = new PostServiceClient();
            //service.delete(post);
            return View();
        }








        public ActionResult AddPost(Core.Models.Post model) {

            PostServiceClient service = new PostServiceClient();

            Post p = new Post();
            
            p.createdAt = new DateTime();
            p.item = new Item() {category = new Category() { categoryId = 1, name = "categoria", status = 1 } };

            p.user = new User() { userId = ((Core.UserServiceService.User)Session["currentUser"]).userId };
            p.place = new Place() { city = "Sampa", name = "teste", placeId = 1 };
           
            p.legend = model.legend;
            p.item.description = model.item.description;
            p.item.category.categoryId = model.item.category.categoryId;
            

            service.save(p);
            return RedirectToAction("Index");
        }


        public ActionResult post(){

            PostServiceClient service = new PostServiceClient();

            List<Post> posts = service.findAll().ToList();
                //from post in service.findAll()
                                          //select new Core.Models.Post
                                          //{
                                          //    createdAt = post.createdAt,
                                          //    item = new Models.Item(){
                                          //        category = 

                                          //    }
                                          //    post.item,

                                          //};
           
            return View("_post", posts);
        }
        



    }
}
