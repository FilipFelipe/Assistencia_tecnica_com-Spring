package com.projeto.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.projeto.model.Usuario;
import com.projeto.repository.UsuarioRepository;
import com.projeto.service.UsuarioService;
import com.projeto.service.exceptions.EmailCadastradoException;

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
		
		Optional<Usuario> usuarioCadastrado = 
				this.findUsuarioByEmail(entity.getEmail());
		
		if (usuarioCadastrado.isPresent() && !usuarioCadastrado.get().equals(entity)) {
			throw new EmailCadastradoException(
					String.format("O E-mail %s já está cadastrado no sistema ", entity.getEmail()));
		}
		
		
		return usuarioRepositoy.save(entity);
	}

	@Override
	public Usuario update(Usuario entity) {
		return this.save(entity);
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
	
	
	@Override
	public Optional<Usuario> findUsuarioByEmail(String email){
		return usuarioRepositoy.findUsuarioByEmail(email);
				
	}

	


}
