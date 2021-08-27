package com.naldana.exampleSpring01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.naldana.exampleSpring01")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
 