package com.ggozlo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class SaveCommand implements MCommand {

	private final OracleMemberRepository repository;
	
	@Autowired
	public SaveCommand(OracleMemberRepository repository) {
		super();
		this.repository = repository;
	}


	@Override
	public void execute(Object object) {
		repository.memberSave((Member)object);
		
	}

}
