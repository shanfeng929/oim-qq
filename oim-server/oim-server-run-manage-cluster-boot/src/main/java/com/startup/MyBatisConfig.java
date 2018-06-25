package com.startup;

import java.io.IOException;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.onlyxiahui.query.mybatis.dao.GenericDAO;
import com.onlyxiahui.query.mybatis.dao.JdbcTemplate;

/**
 * 数据源
 *
 * @Author: XiaHui
 * @Date: 2015年12月21日
 * @ModifyUser: XiaHui
 * @ModifyDate: 2015年12月21日
 */
@Configuration
public class MyBatisConfig {

	@Autowired
	DataSourceConfig dataSourceConfig;

	// //////////////////////////////////////////写数据源

	@Bean(name = "txManager")
	public DataSourceTransactionManager txManager() {
		DataSourceTransactionManager bean = new DataSourceTransactionManager();
		bean.setDataSource(dataSourceConfig.writeDataSource());
		return bean;
	}

	@Bean(name = "writeSqlSessionFactory")
	public SqlSessionFactoryBean writeSqlSessionFactory() {
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		try {
			bean.setDataSource(dataSourceConfig.writeDataSource());
			bean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
			bean.setMapperLocations(resolver.getResources("classpath*:/oim/*/*.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Bean(name = "writeSqlSessionTemplate")
	public SqlSessionTemplate writeSqlSessionTemplate() {
		SqlSessionTemplate bean = null;
		try {
			bean = new SqlSessionTemplate(writeSqlSessionFactory().getObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Bean(name = "writeDAO")
	public GenericDAO writeDAO() {
		GenericDAO bean = new GenericDAO();
		bean.setSqlSessionTemplate(writeSqlSessionTemplate());
		return bean;
	}

	// ///////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * 读数据源
	 *
	 * @return
	 */

	@Bean(name = "readSqlSessionFactory")
	public SqlSessionFactoryBean readSqlSessionFactory() {
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();

		try {
			bean.setDataSource(dataSourceConfig.readDataSource());
			bean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
			bean.setMapperLocations(resolver.getResources("classpath*:/oim/*/*.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Bean(name = "readSqlSessionTemplate")
	public SqlSessionTemplate readSqlSessionTemplate() {
		SqlSessionTemplate bean = null;
		try {
			bean = new SqlSessionTemplate(readSqlSessionFactory().getObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Bean(name = "readDAO")
	public GenericDAO readDAO() {
		GenericDAO bean = new GenericDAO();
		bean.setSqlSessionTemplate(readSqlSessionTemplate());
		return bean;
	}

	@Bean(name = "jdbcTemplate")
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate bean = new JdbcTemplate();
		bean.setDataSource(dataSourceConfig.writeDataSource());
		return bean;
	}
}
