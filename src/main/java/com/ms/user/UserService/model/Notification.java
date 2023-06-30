package com.ms.user.UserService.model;

public class Notification {
	private String notificationId;
	  private String description;
	  
	  public Notification(String notificationId, String description) {
		super();
		this.notificationId = notificationId;
		this.description = description;
	 }
	  
	 

	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
