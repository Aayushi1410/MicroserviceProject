package com.ms.user.UserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.user.UserService.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") String userId) {
		User userOne= new User(userId, "userName1", "8394907252");
		return userOne;
		
	}
}
