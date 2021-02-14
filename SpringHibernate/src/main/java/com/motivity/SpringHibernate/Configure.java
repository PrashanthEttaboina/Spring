package com.motivity.SpringHibernate;

import java.util.Properties;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


@Configuration
public class Configure {
	@Bean
	public DataSource datasource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/lotus");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;

	}
	
@Bean
public LocalSessionFactoryBean getLocalSession()
{
	LocalSessionFactoryBean ls=new LocalSessionFactoryBean();
	ls.setDataSource(datasource());
	ls.setAnnotatedClasses(Ninja.class);
	Properties p=new Properties();
	p.setProperty("hibernate.show_sql", "true");
	p.setProperty("hibernate.dialet", "org.hibernate.dialect.MySQL8Dialect");
	p.setProperty("hibernate.hbm2ddl.auto", "update");	
	return ls;
	
}

@Bean
public HibernateTemplate htemplate()
{
	HibernateTemplate ht=new HibernateTemplate();
	ht.setSessionFactory(getLocalSession().getObject());
	ht.setCheckWriteOperations(false);
	return ht;
	
}
@Bean
public InsertMain insertbean()
{
	
	InsertMain il=new InsertMain();
	il.setHtemplate(htemplate());
	return il;				
}

@Bean
public DisplayMain displaybean()
{
	
	DisplayMain il=new DisplayMain();
	il.setHtemplate(htemplate());
	return il;				
}
@Bean
public DeleteMain deletebean()
{
	
	DeleteMain il=new DeleteMain();
	il.setHtemplate(htemplate());
	return il;				
}
@Bean
public UpdateMain updatebean()
{
	
	UpdateMain il=new UpdateMain();
	il.setHtemplate(htemplate());
	return il;				
}

}
