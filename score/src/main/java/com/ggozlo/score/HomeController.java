package com.ggozlo.score;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
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
	
	@RequestMapping("/score")
	public String scoreInput() 
	{
		return "scoreInput";
	}
	
	@RequestMapping("/scoreView")
	public String scoreView(@Valid Score score, BindingResult bindingResult) 
	{
//		ScoreValidate scoreValidate = new ScoreValidate();
//		scoreValidate.validate(Score, bindingResult);
		if(bindingResult.hasErrors()) {
			return "redirect:score";
		}
		return "scoreView";
	}
	
	//생성자 바인더
	@InitBinder
	public void init(WebDataBinder binder)
	{
		binder.setValidator(new ScoreValidate());
	}
	
}
