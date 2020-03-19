package com.frame.frame.base;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author shr
 * @Date 2020-03-19 15:27
 * @Version 1.0
 */


@Configuration
public class XMybatisPlusConfig {
    private static final Logger LOG = LoggerFactory.getLogger(XMybatisPlusConfig.class);

    /**
     * 乐观锁插件
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}