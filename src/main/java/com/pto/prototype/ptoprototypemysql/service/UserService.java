package com.pto.prototype.ptoprototypemysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import com.pto.prototype.ptoprototypemysql.db.userRepository;
import com.pto.prototype.ptoprototypemysql.model.User;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@SpringBootApplication
@ComponentScan("com.pto.prototype.ptoprototypemysql")

@Service
public class UserService {
	@Autowired
	private userRepository userRepo;
	
	//---------- GET ALL USERS ----------
	public List<User> get(){
		return userRepo.findAll();
	}
	//---------- GET 1 USER ----------
	public Optional<User> getOne(Integer id) {
		return userRepo.findById(id);
	}
	//---------- ADD USER -----------
	public List<User> add(User user) {
		userRepo.save(user);
		return userRepo.findAll();
	}
	//---------- UPDATE USER -----------
	public List<User> update(User user) {	
		userRepo.save(user);
		return userRepo.findAll();
	}
	//---------- DELETE USER -----------

	public List<User> deleteUser(Integer id) {
		userRepo.deleteById(id);
		return userRepo.findAll();
	}
}
