package com.widetns.pms.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

public class DatabaseConfig {

	@Configuration
	@ComponentScan(basePackages = "com.widetns.pms.mapper")
	@MapperScan(basePackages = "com.widetns.pms")
	@EnableTransactionManagement
	public class DataBaseConfig {
		
		@Bean
		public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
			final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
			sessionFactory.setDataSource(dataSource);
			PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		
			sessionFactory.setMapperLocations(resolver.getResources("mapper/*.xml"));
			return sessionFactory.getObject();
		}
		
		@Bean
		public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
			final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
			return sqlSessionTemplate;
		}
		
		
	}
}
