package com.ggozlo.core;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.LONG, locale);
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/sample")
	public String sample(Model model)
	{
		model.addAttribute("id","korea");
		return "sample";
	}
	@RequestMapping("/board")
	public ModelAndView board() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "한라산");
		mav.addObject("kor", 12);
		mav.addObject("eng", 23);
		mav.addObject("mat", 34);
		mav.setViewName("board");
		return mav;
		
	}
	@RequestMapping("/school")
	public String school(Model model) {
		model.addAttribute("name", "홍길동");
		model.addAttribute("kor", 98);
		model.addAttribute("eng", 87);
		model.addAttribute("mat", 65);
		return "school/school";
	}
	@RequestMapping("/person")
	public String person(Model model) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		model.addAttribute("credit", context.getBean("person", Person.class));
		return "address/person";
	}
	@RequestMapping("/person2")
	public ModelAndView person2() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ModelAndView mav = new ModelAndView();
		mav.addObject(context.getBean("person",Person.class));
		mav.setViewName("address/person2");
		return mav;
	}
	
	@RequestMapping("/personInfo1")
	public String personInfo1(Model model) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		model.addAttribute(context.getBean("personInfo", PersonInfo.class));
		return "personInfo/personInfo";
	}
	
	@RequestMapping("/personInfo2")
	public ModelAndView personInfo2() {
		ModelAndView mav = new ModelAndView();
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		mav.addObject(context.getBean("personInfo",PersonInfo.class));
		mav.setViewName("personInfo/personInfo");
		return mav;
	}
	
	@RequestMapping("/student1")
	public String student1(Model model, Score score)  {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Score score = context.getBean("score", Score.class);
//		score.setName(name);
//		score.setNum(Integer.parseInt(num));
//		score.setKor(Integer.parseInt(kor));
//		score.setEng(Integer.parseInt(eng));
//		score.setMat(Integer.parseInt(mat));
//		model.addAttribute(context.getBean("scoreCal", ScoreCal.class));
		model.addAttribute(new ScoreCal(score));
		return "score/student";
	}
	
	@RequestMapping("/student2")
	public ModelAndView sudent2(Score score) {
		ModelAndView mav = new ModelAndView();
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//mav.addObject(context.getBean("scoreCal",ScoreCal.class));
		mav.addObject(new ScoreCal(score));
		mav.setViewName("score/student");
		return mav;
	}
	
	@RequestMapping("/input")
	public String input()
	{
		return "score/input";
	}
}
