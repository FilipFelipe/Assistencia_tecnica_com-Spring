package com.projeto.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class testController {

	@Autowired

	
	@RequestMapping(value="/teste", method=RequestMethod.GET)
	public String form() {
		return "teste";
	}
	
}
