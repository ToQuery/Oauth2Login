package com.toquery.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by heima on 2016/7/7.
 */
@ContextConfiguration(locations = "classpath:/spring/spring-context.xml")
@WebAppConfiguration
//@Profile("develop")
@ActiveProfiles("develop")
@RunWith(value = SpringJUnit4ClassRunner.class)
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {
    public static final Logger log = LogManager.getLogger();
}
