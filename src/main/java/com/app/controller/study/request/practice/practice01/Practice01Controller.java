package com.app.controller.study.request.practice.practice01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice01Controller {

	@RequestMapping("/practice01/main")
	public String main() {
		return "practice01/main";
	}
	
	@RequestMapping("/practice01/product/mouse")
	public String mouse() {
		return "practice01/mouse";
	}
	
	@RequestMapping("/practice01/product/keyboard")
	public String keyboard() {
		return "practice01/keyboard";
	}

}
