package hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication
@ComponentScan(basePackages = "hu.iit.uni.miskolc.nemeth13.webapp.daoimpl")
@EntityScan(basePackages = "hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.entity")
@EnableJpaRepositories(basePackages = "hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.repository")
public class DaoImplApplication {

	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
		return new HibernateJpaSessionFactoryBean();
	}
}
