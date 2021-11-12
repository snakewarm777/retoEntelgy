package com.ppc.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class UserResponse implements Serializable{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<UserResponseDetail> data;
	

	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
		this.data=new  ArrayList<UserResponseDetail>(0);
	}

	public List<UserResponseDetail> getData() {
		return data;
	}

	public void setData(List<UserResponseDetail> data) {
		this.data = data;
	}
	
	
	
 
}
