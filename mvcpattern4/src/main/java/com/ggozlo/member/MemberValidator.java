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
			System.out.println("�̸� �Է� ����");
			errors.rejectValue(name, "����");
		}
		
		String tel = member.getTel();
		if(tel.contains(" ")||tel.isEmpty()) {
			System.out.println("��ȣ �Է� ����");
			errors.rejectValue(tel, "����");
		}
		
		String email = member.getEmail();
		if(email.contains(" ")||email.isEmpty()) {
			System.out.println("�̸��� �Է� ����");
			errors.rejectValue(email, "����");
		}
		System.out.println(errors);
	}

}
