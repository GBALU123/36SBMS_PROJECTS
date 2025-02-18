package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import in.ashokit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeService service = context.getBean(EmployeeService.class);
		service.saveEmployee();
		
		//service.saveMultipleEmployees();
		//service.getEmp();
		//service.getEmps();
		//service.deleteEmpId();
		//service.deleteAllEmps();
		//service.deleteAllIds();
		//service.getEmpsBydept("sales");
		//service.getEmpsByGender("male");
		//service.getEmpGenderAndEmpDept("male", "sales");
		//service.getEmpsBySalary(200000.00f);
	    //service.getEmpAllRecords();
		//service.getEmpById(101);
		service.getGreaterThanDetails(200000);
	}

}
