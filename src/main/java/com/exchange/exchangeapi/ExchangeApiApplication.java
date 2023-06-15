package com.exchange.exchangeapi;

import com.exchange.exchangeapi.entity.UserRole;
import com.exchange.exchangeapi.repo.UserRepo;
import com.exchange.exchangeapi.repo.UserRoleRepo;
import com.exchange.exchangeapi.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExchangeApiApplication implements CommandLineRunner {
	@Autowired
	private UserRoleService userRoleService;


	public static void main(String[] args) {
		SpringApplication.run(ExchangeApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//save user role
		userRoleService.initializeRole();


	}
}
