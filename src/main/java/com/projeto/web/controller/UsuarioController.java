package com.projeto.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.model.Usuario;
import com.projeto.service.UsuarioService;

@Controller
@RequestMapping(value="/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService; 
	
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public ModelAndView listarUsuarios(){
		ModelAndView mv = new ModelAndView("/usuario/lista");
		List<Usuario> listaUsuario = usuarioService.findAll();
		mv.addObject("listaUsuario", listaUsuario);
		return mv;
	}
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String form() {
		return "usuario/login";
	}
	
	@GetMapping("/novo")
	public ModelAndView cadastroUsuario(Usuario usuario) {
		ModelAndView mv = new ModelAndView("usuario/usuario");
		mv.addObject("usuario", usuario);
		return mv;
	}
	@GetMapping("/login")
	public ModelAndView loginUsuario(Usuario usuario) {
		ModelAndView mv = new ModelAndView("usuario/login");
		mv.addObject("usuario", usuario);
		return mv;
	}
	
	@GetMapping("/alterar/{id}")
	public ModelAndView buscarUsuarioAlterar(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("usuario/alterar");
		Usuario usuario = usuarioService.getOne(id);
		mv.addObject("usuario", usuario);
		return mv;
	}
	@GetMapping("/alterar_senha/{id}")
	public ModelAndView buscarUsuarioAlterarsenha(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("usuario/alterar_senha");
		Usuario usuario = usuarioService.getOne(id);
		mv.addObject("usuario", usuario);
		return mv;
	}
	@RequestMapping(value= "/alterar_senha/{id}",method = RequestMethod.POST)
	public ModelAndView alterarUsuarioSenha(@Valid Usuario usuario, BindingResult result) {
		if (result.hasErrors()) {
			return cadastroUsuario(usuario);
		}
		usuarioService.update(usuario);
		return new ModelAndView("redirect:/usuario/list");
	}
	
	@GetMapping("/excluir/{id}")
	public ModelAndView buscarUsuarioExcluir(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("usuario/excluir_usuario");
		Usuario usuario = usuarioService.getOne(id);
		mv.addObject("usuario", usuario);
		return mv;
	}
		
	@RequestMapping(value= "/novo",method = RequestMethod.POST)
	public ModelAndView incluirUsuario(@Valid Usuario usuario, BindingResult result) {
		if (result.hasErrors()) {
			return cadastroUsuario(usuario);
		}
		usuarioService.save(usuario);
		return new ModelAndView("redirect:/usuario/list");
	}
	
	@RequestMapping(value= "/alterar/{id}",method = RequestMethod.POST)
	public ModelAndView alterarUsuario(@Valid Usuario usuario, BindingResult result) {
		if (result.hasErrors()) {
			return cadastroUsuario(usuario);
		}
		usuarioService.update(usuario);
		return new ModelAndView("redirect:/usuario/list");
	}
		
	@RequestMapping(value= "/excluir",method = RequestMethod.POST)
	public ModelAndView excluirUsuario(Usuario usuario) {
		usuarioService.deleteById(usuario.getId());
		return new ModelAndView("redirect:/usuario/list");
	}
	
	
	
	
	
	
	
}







