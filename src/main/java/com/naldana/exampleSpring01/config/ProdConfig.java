package com.naldana.exampleSpring01.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;


@Profile("prod")
@Configuration
@ComponentScan(basePackages = "com.naldana.exampleSpring01")
@PropertySource("classpath:application.properties")
public class ProdConfig {

}
 