/*
 * Copyright (c) 2014-2015, lingang.chen@gmail.com  All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.example.hxyz.assess.persistant.repository;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * Reason:	标识MyBatis的Dao,方便{@link org.mybatis.spring.mapper.MapperScannerConfigurer}的扫描。
 *
 * @author Chen LinGang
 * @version $Id: MyBatisRepository, v 0.1 2015/7/12 12:07
 * @since JDK 1.8
 * @see org.mybatis.spring.mapper.MapperScannerConfigurer
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public  @interface MyBatisRepository {
    String value() default "";
}
