package com.cg.entities;

public class Users {
	private String username;
	private String password;
	private String role;
	private Long mobile_no;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(Long mobile_no) {
		this.mobile_no = mobile_no;
	}
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password
				+ ", role=" + role + ", mobile_no=" + mobile_no + "]";
	}
	public Users(String username, String password, String role, Long mobile_no) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.mobile_no = mobile_no;
	}
	
	
      public Users() {
		
	    }

}
