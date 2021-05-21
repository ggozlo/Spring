package com.ggozlo.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class MoneyValidator implements Validator {

	private Money money;
	
	
	@Autowired
	public void setMoney(Money money) {
		this.money = money;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return Money.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Account account = (Account) target;
		
		if(money.getMoney() < account.getMoney()) {
			errors.rejectValue("ÀÜ¾×", "ÀÜ¾×ºÎÁ·");
		}
	}

}
