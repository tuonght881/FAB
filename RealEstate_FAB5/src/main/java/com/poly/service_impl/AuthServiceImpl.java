package com.poly.service_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.poly.bean.Auth;
import com.poly.dao.AuthDAO;
import com.poly.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService{

	@Autowired
	AuthDAO dao;
	
	@Override
	public Auth create(Auth auth) {
		return dao.save(auth);
	}

	@Override
	public Auth getAuth(String username) {
		// TODO Auto-generated method stub
		return dao.getAuth(username);
	}

	@Override
	public Page<Auth> getAllAdmin(String username, Pageable p) {
		// TODO Auto-generated method stub
		return dao.getAuthAdmin(username, p);
	}

	@Override
	public Page<Auth> getAllUses(String username, Pageable p) {
		// TODO Auto-generated method stub
		return dao.getAuthUsers(username, p);
	}

}
