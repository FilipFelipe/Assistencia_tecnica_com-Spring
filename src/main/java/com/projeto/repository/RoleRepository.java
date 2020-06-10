package com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.model.Role;
import com.projeto.repository.query.RoleQuery;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>, RoleQuery{

}
