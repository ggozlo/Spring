package core.ggozlo.db;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.jsp.jstl.core.Config;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
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
	
	ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
	//ApplicationContext context =  new ClassPathXmlApplicationContext("servlet-context.xml");
	SCommand command ;
	
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
	
	@RequestMapping("/scoreInput")
	public String socreInput() {
		return "scoreInput";
	}
	
	@RequestMapping("/scoreSave")
	public String scoreSave(@Valid Score score, BindingResult result) {
		if(result.hasErrors()) {
			return "scoreInput";
		}
		command = context.getBean(SaveCommand.class);
		command.execute(score);
		return "redirect:scorePrint";
	}
	
	@InitBinder
	public void init(WebDataBinder binder) {
		binder.setValidator(new ScoreValidator());
	}
	
	@RequestMapping("/scorePrint")
	public String scorePrint(Model model) {
		command = context.getBean(PrintCommand.class);
		command.execute(model);
		return "scorePrint";
	}
}
