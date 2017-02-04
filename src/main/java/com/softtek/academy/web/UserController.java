package com.softtek.academy.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softtek.academy.domain.UserEntity;
import com.softtek.academy.service.UserService;


@RequestMapping(value = "/user")
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService; 
	
	@RequestMapping(value = "/list")
	public String ListView(){
		return "UserList"; 
	}
	
	@RequestMapping(value = "/userList", method=RequestMethod.GET)
	public ResponseEntity<?> List() {
		List<UserEntity> users = userService.list(); 
		if (users.isEmpty()) {

			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<UserEntity>>(users, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value = "/create")
	public String createUser(){
		return "CreateUser"; 
	}
	
//	
	
}
