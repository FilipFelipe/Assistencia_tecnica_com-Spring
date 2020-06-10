package com.projeto.service;


import java.util.Optional;
import com.projeto.model.Usuario;

public interface UsuarioService extends GenericService<Usuario, Long> {

	Optional<Usuario> findUsuarioByEmail(String email);
}

