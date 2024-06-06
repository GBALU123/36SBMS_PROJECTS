package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpname("Balu");
		emp.setSalary(5000.00);
		
		employeeRepository.save(emp);
		
	}

}
