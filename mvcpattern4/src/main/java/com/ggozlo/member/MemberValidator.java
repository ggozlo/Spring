package com.ggozlo.member;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Member.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Member member = (Member)target;
		
		String name = member.getName();
		if(name.contains(" ")||name.isEmpty()) {
			System.out.println("이름 입력 오류");
			errors.rejectValue(name, "오류");
		}
		
		String tel = member.getTel();
		if(tel.contains(" ")||tel.isEmpty()) {
			System.out.println("번호 입력 오류");
			errors.rejectValue(tel, "오류");
		}
		
		String email = member.getEmail();
		if(email.contains(" ")||email.isEmpty()) {
			System.out.println("이메일 입력 오류");
			errors.rejectValue(email, "오류");
		}
		System.out.println(errors);
	}

}
