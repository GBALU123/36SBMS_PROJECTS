package in.ashokit;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.ContactUsEntity;
import in.ashokit.repo.ContactUsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		ContactUsRepo bean = context.getBean(ContactUsRepo.class);
		
		ContactUsEntity entity = new ContactUsEntity();
		//entity.setCid(101);
		entity.setCname("Balu");
		entity.setCemail("balu19@gmail.com");
		entity.setCphno("7036397048");
		
		
		bean.save(entity);
		
		
	}

}
