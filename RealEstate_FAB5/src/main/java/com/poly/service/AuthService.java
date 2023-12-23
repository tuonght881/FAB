package com.poly.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.poly.bean.Auth;

public interface AuthService {

	public Auth create(Auth auth);
	
	public Auth getAuth(String username);
	
	public Page<Auth> getAllAdmin(String username, Pageable p);
	
	public Page<Auth> getAllUses(String username, Pageable p);
}
