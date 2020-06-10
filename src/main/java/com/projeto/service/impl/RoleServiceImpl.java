package com.projeto.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.projeto.model.Role;
import com.projeto.repository.RoleRepository;
import com.projeto.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl<RoleRepositoy> implements RoleService{

	
	@Autowired
	private RoleRepository roleRepositoy;
	@Override
	@Transactional(readOnly = true)
	public List<Role> findAll() {
		return roleRepositoy.findAll();
	}

	

	@Override
	public Role findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Role save(Role entity) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Role update(Role entity) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Role getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}





	


}
