package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.CourseService;

@SpringBootApplication
public class AwsS3CourseInfoApplication {

	public static void main(String[] args) {
		 SpringApplication.run(AwsS3CourseInfoApplication.class, args);
		
		
	}

}
