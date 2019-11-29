package com.test.j1908.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

@Configuration
public class MapperConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");//设置会话工厂
        mapperScannerConfigurer.setBasePackage("com.test.*.mapper");//设置扫描的接口
        Properties properties = new Properties();
        properties.setProperty("notEmpty","false"); //默认时，是否为空
        properties.setProperty("IDENTITY","MYSQL");//主键策略遵循的数据库标准
        properties.setProperty("mappers","com.test.j1908.config.BaseMapper");//设置通用父mapper
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
