package com.ggozlo.score;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ScoreValidate implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Score.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Score score = (Score) target;
		
		String name = score.getName();
		if(name.isEmpty() || name.contains(" ")) {
			System.out.println("이름 입력 오류");
			errors.rejectValue("name", "이름 오류");
		}
		
		int kor = score.getKor();
		if( kor <0 || kor > 100 ) {
			System.out.println("국어 점수 범위 초과");
			errors.rejectValue("kor", "초과");
		}
		
		int eng = score.getEng();
		if( eng <0 || eng > 100 ) {
			System.out.println("영어 점수 범위 초과");
			errors.rejectValue("eng", "초과");
		}
		
		int mat = score.getMat();
		if( mat <0 || mat > 100 ) {
			System.out.println("수학 점수 범위 초과");
			errors.rejectValue("mat", "초과");
		}
		
	}

}
