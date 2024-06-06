package in.ashokit.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
 public AppConfig() {
	System.out.println("appconfig :: constructor");
}
	@Bean
	 public AppSecurity createSecurityobj() {
		System.out.println("bean method executed....");
		  AppSecurity as = new AppSecurity("SHA-123");
		  return as;
}
}
