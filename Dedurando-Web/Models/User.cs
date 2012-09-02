using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.ComponentModel.DataAnnotations;

namespace Core.Models
{
    public class User{
       
    public long userId{get;set;}

    [Display(Name = "Status")]
	public int status{get;set;}

    [Required]
    [DataType(DataType.EmailAddress)]
    [Display(Name = "Email")]
	public String mail{get;set;}

    [Required]
    [Display(Name = "Primeiro Nome")]
    [StringLength(50, ErrorMessage = "O nome deve ter entre 4 a 50 caracteres", MinimumLength = 4)]
	public String firstName{get;set;}

    [StringLength(50, ErrorMessage = "O sobrenome deve ter entre 4 a 50 caracteres", MinimumLength = 4)]
	public String lastName{get;set;}

    [Required]
    [DataType(DataType.Password)]
    [Display(Name = "Senha")]
	public String password{get;set;}
	
	public String ipAddress{get;set;}
	
	public String resetPasswordToken{get;set;}
	
	public String confirmation_token{get;set;}
	
	//public byte[] photo{get;set;}

    [Display(Name = "Telefone")]
	public String phone{get;set;}

    [Display(Name = "Cidade")]
	public String city{get;set;}
	
	public String country{get;set;}
	
	public DateTime created_at{get;set;}
        
    }
}