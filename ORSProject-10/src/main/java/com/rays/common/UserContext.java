package com.rays.common;

public class UserContext {

	private Long userId = 0l;
	private String loginId = "root";
	private String name = null;
	private Long roleId = 1l;
	private String roleName = "root";
	
	public UserContext() {
		// TODO Auto-generated constructor stub
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public UserContext(Long userId, String loginId, String name, Long roleId, String roleName) {
		super();
		this.userId = userId;
		this.loginId = loginId;
		this.name = name;
		this.roleId = roleId;
		this.roleName = roleName;
	}
	
	

}
