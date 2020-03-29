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
     * 乐观锁配置.
     * <p>
     * 会检测有@Version注解的属性，update时自动加一.
     * </p>
     *
     * @return
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        LOG.info("optimisticLockerInterceptor");
        return new OptimisticLockerInterceptor();
    }
}
