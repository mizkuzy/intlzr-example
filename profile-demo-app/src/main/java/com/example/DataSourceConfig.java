package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {

    @Bean("datasource")
    @Profile("dev")
    DataSource devDataSource(){
        return new DataSource("dev/url", 100500);
    }

    @Bean("datasource")
    @Profile("prod")
    DataSource dataSource(){
        return new DataSource("prod/url", 200500);
    }
}
