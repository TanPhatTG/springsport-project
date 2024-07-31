package com.springsport.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.springsport.backend.*", "com.springsport.backend" })//quét qua các package được khai báo để khởi tạo Spring Bean. Muốn khởi tạo Spring Bean ở cấp độ class dùng @Controller, @Service, @Repository, @Component. Muốn khởi tạo Spring Bean ở cấp độ phương thức dùng @Configuration + @Bean
@EnableJpaRepositories(basePackages = { "com.springsport.backend.*" })//quét qua các package được khai báo để khởi tạo Spring Data JPA
@EntityScan({ "com.springsport.common.*" })
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
