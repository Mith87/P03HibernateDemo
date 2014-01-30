package com.service;

import java.util.List;

import com.model.User;

public interface IService {
	public void add(User puser);
	public User getById(int pid);
	public User getByName(String pname);
	public void update(User puser);
	public void delete(int pid);
	public List<User> getAll();
}
