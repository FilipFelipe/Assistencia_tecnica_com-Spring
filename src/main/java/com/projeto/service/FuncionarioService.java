package com.projeto.service;


import java.util.Optional;

import com.projeto.model.Funcionario;

public interface FuncionarioService extends GenericService<Funcionario, Long> {

	Optional<Funcionario> findFuncionarioByEmail(String email);
}
