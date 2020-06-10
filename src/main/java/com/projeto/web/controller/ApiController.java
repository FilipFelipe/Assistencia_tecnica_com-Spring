package com.projeto.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.projeto.model.Usuario;
import com.projeto.service.UsuarioService;

@Controller
@RequestMapping(value="/api")
public class ApiController {

	@Autowired
	private UsuarioService usuarioService; 
	
	@GetMapping("/visualizar/{id}")
	public ModelAndView buscarApi(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("api/alterar");
		Usuario usuario = usuarioService.getOne(id);
		mv.addObject("usuario", usuario);
		return mv;
		
			
	}
	
	
	
	
	
	
	
	
}







