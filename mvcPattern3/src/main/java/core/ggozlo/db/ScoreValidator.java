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
			System.out.println("�̸��� ����");
			errors.rejectValue("name", "�Է� ����");
		}
		
		int kor = score.getKor();
		if(kor > 100 || kor < 0) {
			System.out.println("���� ���� ����");
			errors.rejectValue("kor", "���� ����");
		}
		
		int eng = score.getEng();
		if(eng > 100 || eng < 0) {
			System.out.println("���� ���� ����");
			errors.rejectValue("eng", "���� ����");
		}
		
		int mat = score.getMat();
		if(mat > 100 ||mat < 0) {
			System.out.println("���� ���� ����");
			errors.rejectValue("mat", "���� ����");
		}
	}

}
