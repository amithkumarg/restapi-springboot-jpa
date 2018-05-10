package com.ln.event.mgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author AmithKumar
 *
 */
@Configuration
@EnableJpaRepositories(basePackages ={ "com.ln.event.mgr.repo"})
@EntityScan(basePackages ={ "com.ln.event.mgr.model"})
@EnableTransactionManagement
public class ApplicationConfig {
	
	public static void main(String[] args){
		SpringApplication.run(ApplicationConfig.class, args);
	}

}
