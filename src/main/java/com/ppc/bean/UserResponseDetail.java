package com.ppc.bean;

import java.io.Serializable;


public class UserResponseDetail implements Serializable{
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	private int id;
	private String email;

	private String last_name;

	public UserResponseDetail(int id2, String last_name2, String email2) {
		// TODO Auto-generated constructor stub
		this.id=id2;
		this.last_name=last_name2;
		this.email=email2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


 
 
}
