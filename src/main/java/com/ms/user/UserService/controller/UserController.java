package com.ms.user.UserService.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ms.user.UserService.model.Notification;
import com.ms.user.UserService.model.Post;
import com.ms.user.UserService.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
    
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") String userId) {
		User userOne= new User(userId, "userName" + userId, "8394907252");
		
		Post post = restTemplate.getForObject("http://post-service/post/p1", Post.class);
		userOne.setPost(post);
		
		Notification notification = restTemplate.getForObject("http://localhost:8090/notification/n1", Notification.class);
		userOne.setNotification(notification);
		
		return userOne;
		
		
	}
}
