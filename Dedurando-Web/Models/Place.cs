using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.ComponentModel.DataAnnotations;

namespace Core.Models
{
    public class Place{

    public long placeId{get;set;}

    [Display(Name = "Cidade")]
    public String city{get;set;}

    [Display(Name = "Local")]
	public String name{get;set;}

    [Display(Name = "Longitude")]
    public long longitude { get; set; }

    [Display(Name = "Latitude")]
    public long latitude { get; set; }

    }
}