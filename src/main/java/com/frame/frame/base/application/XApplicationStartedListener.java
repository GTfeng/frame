package com.frame.frame.base.application;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * @Author shr
 * @Date 2020-01-20 14:41
 * @Version 1.0
 */
@Component
public class XApplicationStartedListener implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger LOG = LoggerFactory.getLogger(XApplicationStartedListener.class);


    /**
     * welcome message
     */
    @Value("classpath:start_yes.txt")
    private Resource resourceOfWelcomeMessage;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        String msg = "";
        try {
            String content = IOUtils.toString(this.resourceOfWelcomeMessage.getInputStream(), "UTF-8");
//            LOG.info("public class XApplicationStartedListener implements ApplicationListener<ContextRefreshedEvent>");
            msg = content;
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOG.info(msg);
    }
}
