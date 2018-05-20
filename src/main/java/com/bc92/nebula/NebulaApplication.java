package com.bc92.nebula;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bc92.nebula.*.dao")
public class NebulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NebulaApplication.class, args);
	}
}
