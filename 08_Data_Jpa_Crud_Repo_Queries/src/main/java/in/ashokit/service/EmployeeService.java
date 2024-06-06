package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepo;

@Service
public class EmployeeService {

	private EmployeeRepo empRepo;
	
	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}
	
	public void saveMultipleEmps() {
		Employee emp1 = new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("Balu");
		emp1.setEmpSalary(20000);
		emp1.setEmpGender("male");
		emp1.setEmpDept("Admin");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(102);
		emp2.setEmpName("raju");
		emp2.setEmpSalary(10000);
		emp2.setEmpGender("male");
		emp2.setEmpDept("sales");
		
		Employee emp3 = new Employee();
		emp3.setEmpId(103);
		emp3.setEmpName("jason");
		emp3.setEmpSalary(80000);
		emp3.setEmpGender("male");
		emp3.setEmpDept("sales");
		
		Employee emp4 = new Employee();
		emp4.setEmpId(104);
		emp4.setEmpName("Rani");
		emp4.setEmpSalary(70000);
		emp4.setEmpGender("fe-male");
		emp4.setEmpDept("Admin");
				
		Employee emp5 = new Employee();
		emp5.setEmpId(105);
		emp5.setEmpName("sachin");
		emp5.setEmpSalary(50000);
		emp5.setEmpGender("male");
		emp5.setEmpDept("Admin");
		
		List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
		Iterable<Employee> all = empRepo.saveAll(list);
		System.out.println(all);
	}
	
	public void getEmps() {
		;
		Iterable<Employee> all = empRepo.findAll();
		
		// by using method references
		//all.forEach(System.out::println);
		
		//by using lambda expression
		all.forEach(e -> System.out.println(e));
	}
	
	//sorting the order by using jpaRepository
	public void getEmpsSortOrder(String column) {
		
		Sort sort = Sort.by(column).descending();
		Iterable<Employee> all = empRepo.findAll(sort);
		all.forEach(e -> System.out.println(e));
		
	}
	
	// pagination by using jpaRepository
	public void getEmpsWithPagination(int pagesize, int pageno) {
		
	PageRequest request = PageRequest.of(pageno-1, pagesize);
	Page<Employee> page = empRepo.findAll(request);
	List<Employee> content = page.getContent();
	content.forEach(e -> System.out.println(e));
             
	}
	
	// Query By Example
	public void getEmpsQBE(){
		// if user select dept then set dept value to entity
		
		Employee emp = new Employee();
		emp.setEmpDept("sales");
		emp.setEmpGender("male");
		emp.setEmpName("raju");
		Example<Employee> of = Example.of(emp);
		List<Employee> findAll = empRepo.findAll(of);
		findAll.forEach(e -> System.out.println(e));		
		
	}
}
