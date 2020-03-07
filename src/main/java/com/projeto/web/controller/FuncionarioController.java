package com.projeto.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/funcionario")
public class FuncionarioController {

	@Autowired
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String form() {
		return "funcionario/login";
	}
}
