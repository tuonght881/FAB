package com.poly.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.bean.Auth;

public interface AuthDAO extends JpaRepository<Auth, Integer>{

	@Query(value="select * from auth where users = ?1", nativeQuery = true)
	public Auth getAuth(String username);
	
	@Query(value="select * from auth where roles = 'admin' and users Not in (select username from users where username = ?1)", nativeQuery = true)
	public Page<Auth> getAuthAdmin(String username, Pageable p);
	
	@Query(value="select * from auth where roles = 'user' and users Not in (select username from users where username = ?1)", nativeQuery = true)
	public Page<Auth> getAuthUsers(String username, Pageable p);
}
