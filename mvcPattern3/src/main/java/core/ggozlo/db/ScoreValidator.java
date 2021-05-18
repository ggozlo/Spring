package core.ggozlo.db;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ScoreValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Score.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Score score = (Score) target;
		
		String name = score.getName();
		if(name.contains(" ") || name.isEmpty()) {
			System.out.println("이름값 오류");
			errors.rejectValue("name", "입력 오류");
		}
		
		int kor = score.getKor();
		if(kor > 100 || kor < 0) {
			System.out.println("국어 범위 오류");
			errors.rejectValue("kor", "범위 오류");
		}
		
		int eng = score.getEng();
		if(eng > 100 || eng < 0) {
			System.out.println("영어 범위 오류");
			errors.rejectValue("eng", "범위 오류");
		}
		
		int mat = score.getMat();
		if(mat > 100 ||mat < 0) {
			System.out.println("수학 범위 오류");
			errors.rejectValue("mat", "범위 오류");
		}
	}

}
