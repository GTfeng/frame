package com.frame.frame.base;

import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shr
 * @Date 2020-01-21 10:14
 * @Version 1.0
 */
@Configuration
public class XMybatisPlusConfig {
    private static final Logger LOG = LoggerFactory.getLogger(XMybatisPlusConfig.class);


    private static final String MAPPER_LOCATIONS = "classpath:com/frame/frame/web/xml/*.xml";

    /**
     * mybatis-plus分页插件<br>
     * 文档：http://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectClazz("com.as.base.dialect.XOracleDialectDemo");
        List<ISqlParser> sqlParserList = new ArrayList<>();

        // 【测试多租户】 SQL 解析处理拦截器<br>
        // 这里固定写成住户 1 实际情况你可以从cookie读取，因此数据看不到 【 麻花藤 】 这条记录（ 注意观察 SQL ）<br>
        /*
        TenantSqlParser tenantSqlParser = new TenantSqlParser();
        tenantSqlParser.setTenantHandler(new TenantHandler() {
            @Override
            public Expression getTenantId() {
                return new LongValue(1L);
            }

            @Override
            public String getTenantIdColumn() {
                return "tenant_id";
            }

            @Override
            public boolean doTableFilter(String tableName) {
                // 这里可以判断是否过滤表
//                if ("user".equals(tableName)) {
//                    return true;
//                }
                return false;
            }
        });
        sqlParserList.add(tenantSqlParser);
        paginationInterceptor.setSqlParserList(sqlParserList);
        */
//        paginationInterceptor.setSqlParserFilter(new ISqlParserFilter() {
//            @Override
//            public boolean doFilter(MetaObject metaObject) {
//                MappedStatement ms = PluginUtils.getMappedStatement(metaObject);
//                // 过滤自定义查询此时无租户信息约束【 麻花藤 】出现
//                if ("com.as.cyems.mapper.BakUserMapper.selectListBySQL".equals(ms.getId())) {
//                    return true;
//                }
//                return false;
//            }
//        });
        return paginationInterceptor;
    }

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
        return new OptimisticLockerInterceptor();
    }

    /**
     * 开启逻辑删除.
     *
     * @return
     */

    @Bean
    public com.baomidou.mybatisplus.core.injector.ISqlInjector logicSqlInjector() {
        return new LogicSqlInjector();
    }

}
