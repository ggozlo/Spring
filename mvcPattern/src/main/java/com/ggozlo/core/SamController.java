package com.ggozlo.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class SamController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/sam1")
	 public String sam1() {
		return "project/sam1";
	}
	@RequestMapping("/sam2")
	 public String sam2() {
		return "project/sam2";
	}
	@RequestMapping("/sam3")
	 public String sam3() {
		return "project/sam3";
	}
	@RequestMapping("/sam4")
	 public String sam4() {
		return "project/sam4";
	}
	@RequestMapping("/sam5")
	 public String sam5() {
		return "project/sam5";
	}
	
}
