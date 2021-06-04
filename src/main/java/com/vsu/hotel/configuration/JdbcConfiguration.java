package com.vsu.hotel.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbcConfiguration {
    @Value("${spring.datasource.username}")
    private String usernameDatabase;

    @Value("${spring.datasource.password}")
    private String passwordDatabase;
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/music_service_db");
        dataSource.setUsername(usernameDatabase);
        dataSource.setPassword(passwordDatabase);
        return dataSource;
    }
}
