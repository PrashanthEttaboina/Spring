package com.motivity;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.motivity"})
public class SpringConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
	@Bean
	public DriverManagerDataSource getConnect() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/kims");
		dmds.setUsername("root");
		dmds.setPassword("root");
		return dmds;
	}

	@Bean
	public LocalSessionFactoryBean getSession() {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(getConnect());
		lsfb.setAnnotatedClasses(PatientBean.class,DoctorBean.class,AppointmentBean.class);
		Properties hp = new Properties();
		hp.setProperty("hibernate.show_sql", "true");
		hp.setProperty("hibernate.dialet", "org.hibernate.dialect.MySQL8Dialect");
		hp.setProperty("hibernate.hbm2ddl.auto", "update");  //by default it is update 
//		hp.setProperty("hibernate.format_sql", "true");
		lsfb.setHibernateProperties(hp);
		return lsfb;
	}
}