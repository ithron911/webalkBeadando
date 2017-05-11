package hu.iit.uni.miskolc.nemeth.webdev.controller.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebAppInitializer extends AbstractSecurityWebApplicationInitializer {

	 public SecurityWebAppInitializer() {
        super(SecurityConfiguration.class);
    }
}
