package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepo;
import in.ashokit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	 //List<Employee> emps = bean.getAllRecords();
	//emps.forEach(System.out::println);
	//emps.deleteEmp(101);
    //EmployeeService service = context.getBean(EmployeeService.class);
	
	//service.getEmps();
	 EmployeeService service = context.getBean(EmployeeService.class);
	 //service.saveMultipleEmps();	
	//service.getEmpsSortOrder("empId");
	 //service.getEmpsWithPagination(3,1);
	 service.getEmpsQBE();
	}

}
