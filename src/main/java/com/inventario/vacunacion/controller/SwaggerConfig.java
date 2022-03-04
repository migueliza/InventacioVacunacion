package com.inventario.vacunacion.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.google.common.base.Predicate;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import static springfox.documentation.builders.PathSelectors.regex;
//import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	 private static final String SWAGGER_API_VERSION = "1.0";
	    private static final String LICENSE_TEXT = "License";
	    private static final String title = "Spacestudy Framework REST API";
	    private static final String description = "docs for test Framework";

	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title(title)
	                .description(description)
	                .license(LICENSE_TEXT)
	                .version(SWAGGER_API_VERSION)
	                .build();
	    }

	    @Bean
	    public Docket frameworkApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	                .pathMapping("/")
	                .select()
	                .paths(PathSelectors.regex("/inventario-vacunacion.*"))
	                .build();
	    }
}
