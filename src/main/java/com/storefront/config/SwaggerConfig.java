package com.storefront.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {

    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title("Storefront Demo - Orders API")
                .description("Spring Boot demo application, backed by MongoDB and Kafka.")
                .termsOfServiceUrl("")
                .contact(new Contact(
                        "Bilel I",
                        "",
                        "bilel.brahim@gmail.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/bilelibrahim/demo-orders/blob/master/LICENSE")
                .version("2.1.0")
                .build();
    }
}
