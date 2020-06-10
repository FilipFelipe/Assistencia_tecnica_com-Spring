package com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.model.Usuario;
import com.projeto.repository.query.UsuarioQuery;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>, UsuarioQuery{

}
