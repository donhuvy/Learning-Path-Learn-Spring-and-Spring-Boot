package com.oreilly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class InfractureConfig {

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource();
    }

}