package com.hackthon.codestars;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CheckBalanceAppApplication {
	@Bean
	ModelMapper getModelMapperBean(){
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(CheckBalanceAppApplication.class, args);
	}

}
