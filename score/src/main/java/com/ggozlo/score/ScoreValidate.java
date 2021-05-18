package com.ggozlo.score;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ScoreValidate implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Score.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Score score = (Score) target;
		
		String name = score.getName();
		if(name.isEmpty() || name.contains(" ")) {
			System.out.println("�̸� �Է� ����");
			errors.rejectValue("name", "�̸� ����");
		}
		
		int kor = score.getKor();
		if( kor <0 || kor > 100 ) {
			System.out.println("���� ���� ���� �ʰ�");
			errors.rejectValue("kor", "�ʰ�");
		}
		
		int eng = score.getEng();
		if( eng <0 || eng > 100 ) {
			System.out.println("���� ���� ���� �ʰ�");
			errors.rejectValue("eng", "�ʰ�");
		}
		
		int mat = score.getMat();
		if( mat <0 || mat > 100 ) {
			System.out.println("���� ���� ���� �ʰ�");
			errors.rejectValue("mat", "�ʰ�");
		}
		
	}

}
