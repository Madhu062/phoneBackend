package com.madhu.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.*;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.madhu.rest.controller")
public class RestApiApplication {

	public static void main(String[] args) throws Exception {
//		String url ="jdbc:mysql://localhost:3306/localhost";
//		String name ="sa";
//		String password = "Madhu@123";
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url,name,password);
		SpringApplication.run(RestApiApplication.class, args);
		
	}

}
