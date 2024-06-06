package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.employee;
import in.ashokit.repo.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepo bean = context.getBean(EmployeeRepo.class);
		
		employee emp = new employee();
		emp.setEname("balu");
		emp.setEsalary(1000.00);
		employee save = bean.save(emp);
		
		System.out.println("record is inserted");
		System.out.println(save);
	}

}
