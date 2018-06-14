package com.oss.shop;

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
@EnableJpaRepositories(basePackages ={ "com.oss.shop.repo"})
@EntityScan(basePackages ={ "com.oss.shop.model"})
@EnableTransactionManagement
public class ApplicationConfig {
  
}
