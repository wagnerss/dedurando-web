using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.ComponentModel.DataAnnotations;

namespace Core.Models
{
    public class Category{

        [Display(Name = "Categoria")]
        public long categoryId{get;set;}

        [Display(Name = "Categoria")]
        public string name{get;set;}

        public int status{get;set;}
    }
}