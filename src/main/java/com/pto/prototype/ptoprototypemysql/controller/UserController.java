package com.pto.prototype.ptoprototypemysql.controller;

import java.io.Console;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pto.prototype.ptoprototypemysql.model.User;
import com.pto.prototype.ptoprototypemysql.service.UserService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value="/rest/user")
public class UserController {
	
	@Autowired
	//private DBResource userRepo;
	private UserService userService;
	
	//---------- GET ALL USERS ----------
	@GetMapping(value = "/all")
	public List<User> getAll(){
		return userService.get();
		//return userRepo.findAll();
	}
	
	//---------- GET 1 USER ----------
	@GetMapping(value = "/{id}")
	public Optional<User> getUser(@PathVariable Integer id) {
		return userService.getOne(id);
	}

	//---------- ADD USER -----------
	@PostMapping(value = "/new")
	public List<User> addUser(@RequestBody User user) {
		return userService.add(user);
	}
	//---------- UPDATE USER -----------
	@PutMapping(value = "/update")
	public List<User> updateUser(@RequestBody User user) {	
		user.setPto_bal(user.getPto_bal()-8);
		return userService.update(user);
	}
	//---------- DELETE USER -----------
	@DeleteMapping(value = "/delete/{id}")
	public List<User> deleteUser(Integer id) {
		return userService.deleteUser(id);
	}
}
