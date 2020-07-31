package com.projectTest.example.projectTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
public class ProjectTestApplication  {

	public static void main(String[] args) {SpringApplication.run(ProjectTestApplication.class, args);}

//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).consumes(Collections.singleton("application/json"))
//				.produces(Collections.singleton("application/json"))
//				// .host(rootDomain+"/api")
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.projectTest.example.projectTes"))
//				.build();
//	}

}
