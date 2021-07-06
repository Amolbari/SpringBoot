package com.example.anmol;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix="app")
public class RunnerClasss implements CommandLineRunner {
//@Value("${app.dbname}")
	private String dbname;
//@Value("${app.username}")
	private String username;
//@Value("${app.pwd}")
	private String pwd;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(this);
	}

}
