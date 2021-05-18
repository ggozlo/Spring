package com.ggozlo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Component
@Service
public class ListCommand implements MCommand {

private final OracleMemberRepository repository;
	
	@Autowired
	public ListCommand(OracleMemberRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public void execute(Object object) {
		Model model = (Model)object;
		model.addAttribute(repository.memberList());
	}

}
