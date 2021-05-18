package com.ggozlo.member;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.naming.Context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.validation.Valid;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	ApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
	MCommand mCommand;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/memberInput")
	public String memberInput() {
		return "memberInput";
	}
	
	@RequestMapping("/memberSave")
	public String memberSave(@Valid Member member, BindingResult result) {
		if(result.hasErrors()) {
			return "memberInput";
		}
		mCommand = context.getBean(SaveCommand.class);
		mCommand.execute(member);
		return "redirect:memberList";
	}
	
	@InitBinder
	public void init(WebDataBinder binder) {
		binder.setValidator(new MemberValidator());
	}
	
	@RequestMapping("/memberList")
	public String memberList(Model model) {
		mCommand = context.getBean(ListCommand.class);
		mCommand.execute(model);
		return "memberList";
	}
}
