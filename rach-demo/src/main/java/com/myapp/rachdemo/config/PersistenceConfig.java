package com.myapp.rachdemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfig {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/conference_demo");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("root");
        System.out.println("System Datasource created");
        return dataSourceBuilder.build();
    }
}
