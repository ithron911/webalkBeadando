package hu.iit.uni.miskolc.nemeth.webdev.controller.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.configuration.DaoApplicationContextConfig;
import hu.iit.uni.miskolc.nemeth.webdev.serviceimpl.configuration.ServiceApplicationContextConfig;

@EnableWebMvc
@Configuration
@ComponentScan("hu.iit.uni.miskolc.nemeth.webdev.controller")
@Import({DaoApplicationContextConfig.class, ServiceApplicationContextConfig.class})
public class WebAppConfiguration extends WebMvcConfigurerAdapter{

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}
