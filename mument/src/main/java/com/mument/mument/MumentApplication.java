package com.mument.mument;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MumentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MumentApplication.class, args);
	}

}
