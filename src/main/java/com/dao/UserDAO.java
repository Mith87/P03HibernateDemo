package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDAO implements IDAO{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	@Override
	public void add(User puser) {
		this.getCurrentSession().save(puser);
	}

	@Override
	public User getById(int pid) {
		User user = (User) this.getCurrentSession().get(User.class, pid);
		return user;
	}

	@Override
	public User getByName(String pname) {
		User user = (User) this.getCurrentSession().get(User.class, pname);
		return user;
	}

	@Override
	public void update(User puser) {
		User userToUpdate = this.getById(puser.getId());
		userToUpdate.setName(puser.getName());
		userToUpdate.setPassword(puser.getPassword());
		userToUpdate.setFirst_name(puser.getFirst_name());
		userToUpdate.setLast_name(puser.getLast_name());
		userToUpdate.setGender(puser.getGender());
		userToUpdate.setBirth_date(puser.getBirth_date());
		this.getCurrentSession().update(userToUpdate);
	}

	@Override
	public void delete(int pid) {
		User teamToDelete = this.getById(pid);
		if (teamToDelete!=null){
			this.getCurrentSession().delete(teamToDelete);
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List getAll() {
		return this.getCurrentSession().createQuery("from User").list();
	}
}
