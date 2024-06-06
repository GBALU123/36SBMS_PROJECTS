package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import in.ashokit.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages = {"in.ashokit, com.tcs"})
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		 
		 ReportDao bean1 = context.getBean(ReportDao.class);
		 ReportDao bean2 = context.getBean(ReportDao.class);
		 System.out.println(bean1.hashCode());
		 System.out.println(bean2.hashCode());
 
  }
	
				  
}
