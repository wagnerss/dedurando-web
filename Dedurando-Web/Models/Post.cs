using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Core.Models;
using System.ComponentModel.DataAnnotations;

namespace Core.Models{

    public class Post {
       
            public long postId {get;set;}

            public Item item { get; set; }

            public Place place { get; set; }

            public Core.UserServiceService.User user { get; set; }

            [Display(Name = "Foto")]
            public byte[] photo { get; set; }

            [Display(Name = "Legenda")]
            public String legend { get; set; }

            [Display(Name = "Data de Postagem")]
            public DateTime createdAt { get; set; }
            
            public List<Post> post { get; set; }

    }
}
