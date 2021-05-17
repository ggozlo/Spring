package com.ggozlo.sub;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ggozlo.sub.member.Member;
import com.ggozlo.sub.member.MemberValidate;


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
	

	
//	@RequestMapping("/memberView")
//	public String memberView(@ModelAttribute("mem") Member member)
//	{
//		return  "/member/memberView";
//	}
	
	//@RequestMapping("/memberView")
	public String memberView(Member member, RedirectAttributes ra)
	{
		ra.addFlashAttribute(member);
		if( member.getAge() > 19) {
			return "redirect:adult";
		}
		return  "redirect:child";
	}
	
	@RequestMapping("/memberInput")
	public String memberInput()
	{
		return "member/memberInput";
	}
	
	@RequestMapping("/adult")
	public String adult()
	{
		return "member/adult";
	}
	
	@RequestMapping("/child")
	public String child()
	{
		return "member/child";
	}
	
	@RequestMapping("/memberView")
	public String checkMember(Member member, BindingResult bindingResult)
	{
		String page = "member/adult";
		MemberValidate memberValidate = new MemberValidate();
		memberValidate.validate(member, bindingResult);
		if(bindingResult.hasErrors())
		{
			page = "member/child";
		}
		return page;
	}
}
