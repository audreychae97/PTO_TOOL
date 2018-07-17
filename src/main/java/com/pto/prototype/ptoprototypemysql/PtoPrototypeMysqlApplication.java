package com.pto.prototype.ptoprototypemysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.pto.prototype.ptoprototypemysql.db")
@SpringBootApplication
@ComponentScan({"com.pto.prototype.ptoprototypemysql"})
@EntityScan("com.pto.prototype.ptoprototypemysql.model")
public class PtoPrototypeMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PtoPrototypeMysqlApplication.class, args);
	}
}
