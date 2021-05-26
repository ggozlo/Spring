package com.ggozlo.bookStore;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.ggozlo.bookStore.DTO.Book;
import com.ggozlo.bookStore.service.BookStoreService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private final BookStoreService service; 
	
	@Autowired
	public HomeController(BookStoreService service) {
		super();
		this.service = service;
	}

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
	
	@RequestMapping("/main") 
	public String main(Model model) {
		model.addAttribute("list", service.findAll() );
		return "main";
	}
	
	@RequestMapping("/modifyForm") 
	public String modifyForm( Model model, String serial) {
		model.addAttribute( service.findOne(serial) );
		return "modifyForm";
	}
	
	@RequestMapping("/modify") 
	public String modify(@Valid Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:modifyForm?serial="+book.getSerial();
		}
		System.out.println(book);
		service.modifyOne(book);
		return "redirect:main";
	}
	
	
	@RequestMapping("/delete")
	public String delete(String serial) {
		service.deleteOne(serial);
		System.out.println(serial);
		return "redirect:main";
	}
	
	@RequestMapping("/bookForm")
	public String bookFrom() {
		return "bookForm";
	}
	
	@RequestMapping("/bookSave")
	public String bookSave( Book book, BindingResult result) {
		if(result.hasErrors()) {
//			return "bookForm";
		}
		System.out.println(book);
		service.save(book);
		return "redirect:main";
	}
}
