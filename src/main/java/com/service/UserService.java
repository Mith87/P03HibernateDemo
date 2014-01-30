package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.IDAO;
import com.dao.UserDAO;
import com.model.User;

@Service
@Transactional
public class UserService implements IService{
	@Autowired
	private IDAO userDAO;
	public UserService(){
		this.userDAO= new UserDAO();
	}
	@Override
	public void add(User puser) {
		this.userDAO.add(puser);
	}
	@Override
	public User getById(int pid) {
		return this.userDAO.getById(pid);
	}
	@Override
	public User getByName(String pname) {
		return this.userDAO.getByName(pname);
	}
	@Override
	public void update(User puser) {
		this.userDAO.update(puser);
	}
	@Override
	public void delete(int pid) {
		this.userDAO.delete(pid);
	}
	@Override
	public List<User> getAll() {
		return this.userDAO.getAll();
	}
}
