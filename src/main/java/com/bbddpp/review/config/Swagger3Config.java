package com.bbddpp.review.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger3Config {

    @Bean
    public Docket apiConfig() {
        return new Docket(DocumentationType.SWAGGER_2) //
                .apiInfo(apiInfo())//
                .select()//
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))//
                .paths(PathSelectors.any())//
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()//
                .title("测试TU管理维护")//
                .description("重新练手JAVA")///
                .contact(new Contact("", "", ""))//
                .version("0.01")//
                .build();
    }
}
