package com.zhuyang.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhuyang.cloud.UserClientFeign;
import com.zhuyang.cloud.entity.User;

@RestController
public class MovieController {
	@Autowired
	UserClientFeign userClientFeign;

	@RequestMapping(value = "/user/all", method = RequestMethod.GET)
	public List<User> findAll() {
		return userClientFeign.findAll();
	}

	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		return userClientFeign.addUser(user);
	}
}