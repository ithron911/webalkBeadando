package hu.iit.uni.miskolc.nemeth13.webapp.controller.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import hu.iit.uni.miskolc.nemeth13.webapp.daoimpl.configuration.DaoImplApplication;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "hu.iit.uni.miskolc.nemeth13.webapp.controller")
public class CinemaTicketManagerApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder appBuilder =
			new SpringApplicationBuilder(
				DaoImplApplication.class,
				CinemaTicketManagerApplication.class
			);

		appBuilder.run(args);
	}
}
