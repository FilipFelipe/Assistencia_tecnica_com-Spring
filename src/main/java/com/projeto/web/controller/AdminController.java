package com.projeto.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.projeto.model.Funcionario;
import com.projeto.model.Usuario;
import com.projeto.service.FuncionarioService;

@Controller
@RequestMapping(value="/admin")
public class AdminController {


	@Autowired
	private FuncionarioService funcionarioService; 
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String form() {
		return "admin/login";
	}

	@GetMapping("/novo")
	public ModelAndView cadastroUsuario(Funcionario funcionario) {
		ModelAndView mv = new ModelAndView("admin/new_funcionario");
		mv.addObject("funcionario", funcionario);
		return mv;
	}
	@RequestMapping(value= "/novo",method = RequestMethod.POST)
	public ModelAndView incluirUsuario(@Valid Funcionario funcionario, BindingResult result) {
		if (result.hasErrors()) {
			return cadastroUsuario(funcionario);
		}
		funcionarioService.save(funcionario);
		return new ModelAndView("redirect:/admin/login");
	}
	
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public ModelAndView listarFuncionario(){
		ModelAndView mv = new ModelAndView("/admin/lista");
		List<Funcionario> listaFuncionario = funcionarioService.findAll();
		mv.addObject("listaFuncionario", listaFuncionario);
		return mv;
	}  
	
	//menu 
	@GetMapping("/menu")
	public ModelAndView ctest() {
		ModelAndView mv = new ModelAndView("/admin/menu");
		return mv;
	}
	
}
