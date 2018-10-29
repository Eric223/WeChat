package com.demo.config;/*

*/

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.AutoMappingBehavior;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    //这个注解表示配置application.yml中的datasource
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        return druidDataSource;
    }

    @Bean(name = "SqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Autowired DruidDataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("com.demo.pojo");

        Resource[] resources1 = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml");
//        Resource[] resources2 = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/msdw/*/*.xml");
//        Resource[] resources = (Resource[]) ArrayUtils.addAll(resources1, resources2);
        factoryBean.setMapperLocations(resources1);
        SqlSessionFactory sqlSessionFactory = factoryBean.getObject();
        org.apache.ibatis.session.Configuration configuration = sqlSessionFactory.getConfiguration();
        configuration.setCacheEnabled(false);
        configuration.setDefaultExecutorType(ExecutorType.REUSE);
        configuration.setLazyLoadingEnabled(false);
        configuration.setAggressiveLazyLoading(true);
        configuration.setUseColumnLabel(true);
        configuration.setUseGeneratedKeys(true);
        configuration.setAutoMappingBehavior(AutoMappingBehavior.PARTIAL);
        configuration.setJdbcTypeForNull(JdbcType.NULL);
        configuration.setDefaultStatementTimeout(25000);
        return factoryBean.getObject();
    }
}
