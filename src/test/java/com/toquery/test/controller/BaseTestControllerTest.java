package com.toquery.test.controller;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by ToQuery on 2016-07-06.
 */

@ContextConfiguration(locations = "classpath:/spring/spring-context.xml")
@WebAppConfiguration
//@Profile("develop")
@ActiveProfiles("develop")
@RunWith(value = SpringJUnit4ClassRunner.class)
public class BaseTestControllerTest extends AbstractTransactionalJUnit4SpringContextTests {

}
