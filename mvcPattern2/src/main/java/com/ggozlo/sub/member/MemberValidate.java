package com.ggozlo.sub.member;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MemberValidate implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object object, Errors errors) {
		Member member = (Member) object;
		String id = member.getId(); 
		if( id.contains("\s") || id.isEmpty()) {
			System.out.println("아이디는 반드시 입력해야합니다!");
			errors.rejectValue("id" , "id is null, id cannot contain space");
		}
		
		String name = member.getName();
		if(name.isEmpty() || name.contains("\s")) {
			System.out.println("이름는 반드시 입력해야합니다!");
			errors.rejectValue("name" , "name is null or name cannot contain space");
		}
		
		String tel = member.getTel();
		if(tel.isEmpty() || tel.contains("\s")) {
			System.out.println("전화번호는 반드시 입력해야합니다!");
			errors.rejectValue("tel" , "tel is null or tel cannot contain space");
		}
		
		int age = member.getAge();
		if(age <= 0) {
			System.out.println("나이는 1보다 작을수 없습니다");
			errors.rejectValue("age" , "age cannot smaller than 1");
		}
	}

}
