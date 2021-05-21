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

	//����� �������̽�, ���� ����Ʈ�� ���, ����� �ܱ� 
	@RequestMapping("/interface")
	public String userInterface(Model model) {
		service.accountList(model);
		
		model.addAttribute(money);
		
		return "userInterface"; //"userInterface";
	}
	
	//�Ա� ���� 
	@RequestMapping("/deposit")
	public String deposit(@Valid Account account, BindingResult result) {
		if(result.hasErrors()  ) {
			return "error";
		}
		service.deposit(account);
		
		return "redirect:interface";
	}
	
	//��� ���� 
	@RequestMapping("/withdraw")
	public String withdraw(@Valid Account account, BindingResult result ) {
		if(result.hasErrors() ) {
			return "error";
		}
		service.withdraw(account);
		return "redirect:interface";
	}
	
	//���� ���� ���� 
	@RequestMapping("/createAccount")
	public String createAccount(@NotNull String name) {

		service.createAccount(name);
		return "redirect:interface";
	}
	
	
	
	
	
}
