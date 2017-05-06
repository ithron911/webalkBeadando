package hu.iit.uni.miskolc.nemeth13.webapp.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CinemaTicketManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaTicketManagerApplication.class, args);
	}
}
