package com.example.Restapi.UserReq;

public class UserReq {
	
    private String userId;
    private String name;
    private String rollNumber;
    
    
	public UserReq(String userId, String name, String rollNumber) {
		super();
		this.userId = userId;
		this.name = name;
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "UserReq [userId=" + userId + ", name=" + name + ", rollNumber=" + rollNumber + "]";
	}
	public UserReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
    
    

}
