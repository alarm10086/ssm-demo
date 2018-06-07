package com.soecode.lyf.web;

import com.soecode.lyf.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@ContextConfiguration(classes = { RootConfig.class })
public class AbstractContextControllerTests {

    @Autowired
    protected WebApplicationContext wac;
}