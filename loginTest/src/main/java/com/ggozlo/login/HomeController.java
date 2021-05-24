package com.ggozlo.login;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	

	
	@RequestMapping("/user")
	public String login() {

		return "security/user";
	}
	
	@RequestMapping("/admin")
	public String welcome() {

		return "security/admin";
	}
	
   @RequestMapping("/login")
   public String loginform() {

      return "security/login";
   }
   
   @RequestMapping("/form")
   public String form() {

      return "security/form";
   }
   
   @RequestMapping("/main")
   public String main() {

      return "security/main";
   }
}
