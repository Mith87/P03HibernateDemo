package com.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String password;
	private String first_name;
	private String last_name;
	private String gender;
	private Date birth_date;
	private Date insert_date;
	
	public User(String pname, String ppassword, String pfirst_name, String plast_name, String pgender, Date pbirth_date){
		this.setName(pname);
		this.setPassword(ppassword);
		this.setFirst_name(pfirst_name);
		this.setLast_name(plast_name);
		this.setGender(pgender);
		this.setBirth_date(pbirth_date);
	}
	public User(int pid, String pname, String ppassword, String pfirst_name, String plast_name, String pgender, Date pbirth_date, Date pinsert_date){
		this.setId(pid);
		this.setName(pname);
		this.setPassword(ppassword);
		this.setFirst_name(pfirst_name);
		this.setLast_name(plast_name);
		this.setGender(pgender);
		this.setBirth_date(pbirth_date);
		this.setInsert_date(pinsert_date);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public Date getInsert_date() {
		return insert_date;
	}
	private void setInsert_date(Date insert_date) {
		this.insert_date = insert_date;
	}
	

	
	
	
	
}
