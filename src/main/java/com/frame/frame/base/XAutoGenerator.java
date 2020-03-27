package com.frame.frame.base;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.frame.frame.base.entity.XSuperLogicEntity;

/**
 * @Author shr
 * @Date 2020-03-26 16:30
 * @Version 1.0
 */
public class XAutoGenerator {
    public static void main(String[] args) {
        AutoGenerator();
    }

    public static void AutoGenerator() {
        //note 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setActiveRecord(true)
                .setAuthor("shr")
                .setOutputDir("src/main/java/tmp")
                .setFileOverride(true)
                .setIdType(IdType.AUTO)
                .setServiceName("%sService")
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setOpen(false);

        //note 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/test")
                .setUsername("root")
                .setPassword("123456");

        //note 策略配置
        //需要生成的表名(模糊匹配)
        LikeTable likeTable = new LikeTable("stu");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(false)
                .setLogicDeleteFieldName("disalbed")
//                .setNaming()
                .setSuperEntityClass(XSuperLogicEntity.class)
                .setEntityLombokModel(true)
                .setTablePrefix("%sTb")
                .setLikeTable(likeTable);


        //note 包策略





        //note 整合
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setDataSource(dataSourceConfig)
                .setGlobalConfig(globalConfig)
                .setStrategy(strategyConfig);


        //note  执行
        autoGenerator.execute();
    }
}
