package com.projeto.repository.query;

import java.util.Optional;

import com.projeto.model.Usuario;

public interface UsuarioQuery {
	
	Optional<Usuario> findUsuarioByEmail(String email);

}
