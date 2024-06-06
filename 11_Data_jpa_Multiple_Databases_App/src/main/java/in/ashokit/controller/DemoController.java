package in.ashokit.controller;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.db1.entities.UserEntity;
import in.ashokit.db1.repo.UserRepository;
import in.ashokit.db2.entities.BookEntity;
import in.ashokit.db2.repo.BookRepository;

@RestController
public class DemoController {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BookRepository bookRepo;
	

	public String add2dataBases() {
		
userRepo.saveAll(Stream.of(new UserEntity(143,"john1"),new UserEntity(455,"raju"))
		.collect(Collectors.toList()));

bookRepo.saveAll(Stream.of(new BookEntity(143,"balu"),new BookEntity(455,"jay"))
		.collect(Collectors.toList()));


		
		
		return "Data Added successfully";
		
	}
}
