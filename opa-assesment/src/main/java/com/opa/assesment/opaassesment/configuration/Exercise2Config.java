package com.opa.assesment.opaassesment.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@Configuration
@EnableJpaRepositories(basePackages = {"com"})
public class Exercise2Config {

}
