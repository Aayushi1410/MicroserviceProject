package com.ms.user.UserService.model;

public class User {
	
 private String userId;
 private String userName;
 private String userPhoneNumber;
 
 public User(String userId, String userName, String userPhoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
	}
 
 
public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getUserPhoneNumber() {
	return userPhoneNumber;
}

public void setUserPhoneNumber(String userPhoneNumber) {
	this.userPhoneNumber = userPhoneNumber;
}
 
 
}
