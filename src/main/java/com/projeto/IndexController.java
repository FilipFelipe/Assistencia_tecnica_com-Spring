package com.projeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping(value="/sobre", method=RequestMethod.GET)
	public String form() {
		return "about";
	}
}
