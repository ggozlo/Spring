package com.ggozlo.bank;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	

	private Money money;
	private final BankService service;

	


	@Autowired
	public HomeController(BankService service) {
		this.service = service;
	}

	
	@Autowired
	public void setMoney(Money money) {
		this.money = money;
	}

	//사용자 인터페이스, 통장 리스트를 출력, 사용자 잔금 
	@RequestMapping("/interface")
	public String userInterface(Model model) {
		service.accountList(model);
		
		model.addAttribute(money);
		
		return "userInterface"; //"userInterface";
	}
	
	//입금 서비스 
	@RequestMapping("/deposit")
	public String deposit(@Valid Account account, BindingResult result) {
		if(result.hasErrors()  ) {
			return "error";
		}
		service.deposit(account);
		
		return "redirect:interface";
	}
	
	//출금 서비스 
	@RequestMapping("/withdraw")
	public String withdraw(@Valid Account account, BindingResult result ) {
		if(result.hasErrors() ) {
			return "error";
		}
		service.withdraw(account);
		return "redirect:interface";
	}
	
	//계좌 생성 서비스 
	@RequestMapping("/createAccount")
	public String createAccount(@NotNull String name) {

		service.createAccount(name);
		return "redirect:interface";
	}
	
	
	
	
	
}
