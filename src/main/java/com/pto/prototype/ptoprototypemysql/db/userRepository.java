package com.pto.prototype.ptoprototypemysql.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pto.prototype.ptoprototypemysql.model.User;

public interface userRepository extends JpaRepository<User, Integer>{
	
}
