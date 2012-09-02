using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.ComponentModel.DataAnnotations;

namespace Core.Models
{
    public class Item{

        public long itemId { get; set; }

        public Category category { get; set; }

        [Required]
        [StringLength(100, ErrorMessage = "Minimo 6 e no maximo 100 caracteres", MinimumLength = 6)]
        [DataType(DataType.Text)]
        [Display(Name = "Titulo")]
        public String name { get; set; }
       
        [Display(Name = "Status")]
        public int status { get; set; }

    }
}