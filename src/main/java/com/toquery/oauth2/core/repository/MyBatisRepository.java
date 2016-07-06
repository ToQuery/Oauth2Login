package com.toquery.oauth2.core.repository;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by ToQuery on 2016-07-06.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisRepository {
}
