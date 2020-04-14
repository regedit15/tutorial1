package com.martin.tutorial1.tutorial1;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tutorial1Application {

	public static void main(String[] args) {

		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		SpringApplication.run(Tutorial1Application.class, args);
	}

}
