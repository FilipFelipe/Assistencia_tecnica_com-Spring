package com.projeto.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages =  "com.projeto.repository")
@ComponentScan(basePackages = "com.projeto.repository")
@EnableTransactionManagement
public class SpringJPAConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl(env.getProperty("spring.datasource.url"));
		datasource.setUsername(env.getProperty("spring.datasource.username"));
		datasource.setPassword(env.getProperty("spring.datasource.password"));

		return datasource;
		
	}
	
	@Bean
	public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		
		factory.setDataSource(dataSource);
		factory.setPackagesToScan("com.projeto.model");
		factory.setJpaVendorAdapter(jpaVendorAdapter());
		factory.setJpaProperties(additionalProperties());
		factory.afterPropertiesSet();
		return factory.getObject();
		
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setDatabasePlatform(env.getProperty("spring.jpa.database-platform"));
		adapter.setGenerateDdl(true);
		return adapter;
	}
	
	@Bean(name="transactionManager")
	public PlatformTransactionManager platformTransactionManager(EntityManagerFactory emf) {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(emf);
		return jpaTransactionManager;
	}
	
	  public Properties additionalProperties() {
	      Properties additionalProperties = new Properties();
	        additionalProperties.put( "hibernate.dialect", env.getProperty("spring.jpa.database-platform")); // ou outro dialeto mais específico para sua infra
	        additionalProperties.put("hibernate.show_sql", env.getProperty("spring.jpa.show-sql"));
	        additionalProperties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
	        return additionalProperties;
	  }
	
}
