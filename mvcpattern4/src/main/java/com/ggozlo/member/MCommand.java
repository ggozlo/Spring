package com.ggozlo.member;

import org.springframework.stereotype.Service;

@Service
public interface MCommand {
	public void execute(Object object);
}
