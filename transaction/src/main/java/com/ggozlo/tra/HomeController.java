package com.ggozlo.tra;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
//	public JdbcTemplate template;
//	//PlatformTransactionManager transactionManager;
//	
//	@Autowired
//	public void setTemplate(JdbcTemplate jdbcTemplate) {
//		this.template = jdbcTemplate;
//		Constant.template = this.template;
//	}
	
	//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	TicketDAO dao ;
	
	@Autowired
	@DependsOn("dao")
	public void setDao( TicketDAO dao) {
		this.dao = dao;
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
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping("/buyTicketCard")
	public String buyTicket(Ticket ticket, Model model) {
		//TicketDAO dao = context.getBean(TicketDAO.class);
	//	dao.buyCard(ticket);
//		try {
//			dao.buyTicket(ticket);
//		} 
//		catch (Exception e) {
//			return "redirect:form";
//		}
		dao.buyTicket(ticket);
		
		model.addAttribute(ticket);
		
		return "buyTicketOut";
	}
}
