package com.projeto.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.model.Usuario;
import com.projeto.repository.UsuarioRepository;
import com.projeto.service.UsuarioService;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepositoy;
		
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return usuarioRepositoy.findAll();
	}

	@Override
	public Usuario save(Usuario entity) {
		
		return usuarioRepositoy.save(entity);
	}

	@Override
	public Usuario update(Usuario entity) {
		return usuarioRepositoy.
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario getOne(Long id) {
		return usuarioRepositoy.getOne(id);
	}
	
	@Override
	public Usuario findById(Long id) {
		return usuarioRepositoy.findById(id)
				  .orElseThrow(()-> new RuntimeException("Usuário não cadastrdo!"));
	}

	@Override
	public void deleteById(Long id) {
		usuarioRepositoy.deleteById(id);
	}
	
	
	public Optional<Usuario> findUsuarioByEmail(String email){
		return null;
	}

	@Override
	public Usuario findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
