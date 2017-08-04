/*
 * Copyright (c) 2014-2015, lingang.chen@gmail.com  All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.example.hxyz.assess.persistant.configuration;

import java.io.IOException;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.example.hxyz.assess.persistant.properties.DataSourceProperties;
import com.example.hxyz.assess.persistant.repository.MyBatisRepository;


/**
 * Reason:	 TODO ADD REASON.
 *
 * @author Chen LinGang
 * @version $Id: MyBatisConfiguration, v 0.1 2015/7/12 12:07
 * @since JDK 1.8
 */
@Configuration
@MapperScan(basePackages = { "com.example.hxyz.domain.mapper" }, annotationClass = MyBatisRepository.class)
@EnableTransactionManagement(proxyTargetClass = true)
public class MyBatisConfiguration implements TransactionManagementConfigurer {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Bean(name = "dataSource", destroyMethod = "close")
    public DataSource getDataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        dataSource.setUrl(dataSourceProperties.getUrl());
        dataSource.setUsername(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());
        dataSource.setDefaultAutoCommit(dataSourceProperties.isDefaultAutoCommit());
        dataSource.setMaxActive(80);
        dataSource.setMaxIdle(40);
        dataSource.setMinIdle(10);
        dataSource.setMaxWait(30000);
        dataSource.setTestWhileIdle(true);
        dataSource.setValidationQuery("select 1");
        dataSource.setTestOnBorrow(true);
        dataSource.setTestOnReturn(false);
        dataSource.setRemoveAbandoned(true);
        dataSource.setRemoveAbandonedTimeout(120);
        dataSource.setTimeBetweenEvictionRunsMillis(30000);
        dataSource.setNumTestsPerEvictionRun(30);
        dataSource.setMinEvictableIdleTimeMillis(1800000);
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean getSqlSessionFactory(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        //不知道为何注解扫描无效(生产状态)
        sqlSessionFactory.setTypeAliasesPackage("com.example.hxyz.domain.entity");
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactory.setConfigLocation(resolver.getResource("classpath:configuration.xml"));
        sqlSessionFactory.setMapperLocations(resolver.getResources("classpath:mapper/*Mapper.xml"));

        return sqlSessionFactory;
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(getDataSource());
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return transactionManager();
    }

}
