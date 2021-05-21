package com.ggozlo.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BankService {
	
	private final BankRepository repository;

	@Autowired
	public BankService(BankRepository repository) {
		super();
		this.repository = repository;
	}
	
	public void createAccount(String name) {
		repository.createAccount(name);
	}
	
	public void accountList(Model model) {
		model.addAttribute(repository.accountList());
	}
	
	public void deposit(Account account) {
		repository.deposit(account.getName(), account.getMoney());
	}
	
	public void withdraw(Account account) {
		repository.withdraw(account.getName(), account.getMoney());
	}

}
