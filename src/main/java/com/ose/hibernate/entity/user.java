package com.ose.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="oe_users")
public class user {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="first_name")
	private String firstname;
	@Column(name="last_name")
	private String lastname;
	@Column(name="uname")
	private String username;
	@Column(name="pswd")
	private String password;
	@Column(name="email")
	private String email;
	
	public user(int id, String firstname, String lastname, String username, String password, String email) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.username=username;
		this.password=password;
		this.email=email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
