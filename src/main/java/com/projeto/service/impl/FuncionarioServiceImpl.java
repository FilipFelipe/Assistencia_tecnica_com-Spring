package com.projeto.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.projeto.model.Funcionario;
import com.projeto.repository.FuncionarioRepository;
import com.projeto.service.FuncionarioService;

@Service
@Transactional
public class FuncionarioServiceImpl implements FuncionarioService{

	@Autowired
	private FuncionarioRepository funcionarioRepositoy;
		
	@Override
	@Transactional(readOnly = true)
	public List<Funcionario> findAll() {
		return funcionarioRepositoy.findAll();
	}

	@Override
	public Funcionario save(Funcionario entity) {
		
		return funcionarioRepositoy.save(entity);
	}

	@Override
	public Funcionario update(Funcionario entity) {
		return funcionarioRepositoy.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public Funcionario getOne(Long id) {
		return funcionarioRepositoy.getOne(id);
	}
	
	@Override
	public Funcionario findById(Long id) {
		return funcionarioRepositoy.findById(id)
				  .orElseThrow(()-> new RuntimeException("Usuário não cadastrdo!"));
	}

	@Override
	public void deleteById(Long id) {
		funcionarioRepositoy.deleteById(id);
	}
	
	
	public Optional<Funcionario> findFUncionarioByEmail(String email){
		return null;
	}

	@Override
	public Optional<Funcionario> findFuncionarioByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
