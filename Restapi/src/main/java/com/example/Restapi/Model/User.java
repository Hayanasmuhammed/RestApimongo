package com.example.Restapi.Model;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
  
@Document(collection="User")
public class User {
    @Id
    private String userId;
    private String name;
    private String rollNumber;
    private LocalDateTime delete;
	public User(String userId, String name, String rollNumber, LocalDateTime delete) {
		super();
		this.userId = userId;
		this.name = name;
		this.rollNumber = rollNumber;
		this.delete = delete;
	}
	public User() {
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
	public LocalDateTime getDelete() {
		return delete;
	}
	public void setDelete(LocalDateTime delete) {
		this.delete = delete;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", rollNumber=" + rollNumber + ", delete=" + delete + "]";
	}
    
}
