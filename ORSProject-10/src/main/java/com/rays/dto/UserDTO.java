package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_USER")
public class UserDTO extends BaseDTO{

	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;
	
	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return firstName + " " + lastName; 
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "login";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
