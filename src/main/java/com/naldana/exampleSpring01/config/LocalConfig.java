package com.naldana.exampleSpring01.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;


@Profile("local")
@Configuration
@ComponentScan(basePackages = "com.naldana.exampleSpring01")
@PropertySource("classpath:application_local.properties")
public class LocalConfig {

}
 