package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	
	public void getGreaterThanDetails(Integer salary) {
		List<Employee> empsDetails = empRepo.getEmpsDetails(salary);
		empsDetails.forEach(System.out::println);
	}
	
	
	
	public void getEmpById(Integer id) {
		Employee employee = empRepo.getEmpById(id);
     System.out.println(employee);
	}
	
	public void getEmpAllRecords() {
		List<Employee> records = empRepo.getEmpAllRecords();
		records.forEach(System.out::println);
		
	}
	
	
	public void getEmpsBySalary(float salary) {
		List<Employee> emps = empRepo.findByEmpSalaryGreaterThanEqual(salary);
		emps.forEach(System.out::println);
		
	}

	public void getEmpGenderAndEmpDept(String gender, String dept) {
		List<Employee> emps = empRepo.findByEmpDeptmAndEmpGender(dept, gender);
		emps.forEach(System.out::println);
		
	}
	public void getEmpsByGender(String gender) {
		List<Employee> list = empRepo.findByEmpGender(gender);
		list.forEach(System.out::println);
	}
	public void getEmpsBydept(String empDept) {
		List<Employee> b = empRepo.findByEmpDeptm(empDept);
         b.forEach(System.out::println);
	}

	public void getEmps() {
		List<Integer> asList = Arrays.asList(101, 102);
		Iterable<Employee> allById = empRepo.findAllById(asList);
		System.out.println(allById);
	}

	public void getEmp() {
		Optional<Employee> findbyid = empRepo.findById(101);
		if (findbyid.isPresent()) {
			Employee employee = findbyid.get();
			System.out.println(employee);
		}
	}

	public void saveEmployee() {
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Balu");
		emp.setEmpSalary(100000);
		emp.setEmpGender("male");
		emp.setEmpDeptm("admin");

		empRepo.save(emp);
	}

	public void saveMultipleEmployees() {
		Employee emp1 = new Employee();
		emp1.setEmpId(102);
		emp1.setEmpName("Tyaka");
		emp1.setEmpSalary(190000);
		emp1.setEmpGender("fe-male");
		emp1.setEmpDeptm("sales");

		Employee emp2 = new Employee();
		emp2.setEmpId(103);
		emp2.setEmpName("Raju");
		emp2.setEmpSalary(290000);
		emp2.setEmpGender("male");
		emp2.setEmpDeptm("sales");

		List<Employee> asList = Arrays.asList(emp1, emp2);

		Iterable<Employee> saveAll = empRepo.saveAll(asList);

		System.out.println(saveAll);
	}

	public void deleteEmpId() {
		empRepo.deleteById(101);

	}

	public void deleteAllEmps() {
		empRepo.deleteAll();
	}

	public void deleteAllIds() {
		List<Integer> asList = Arrays.asList(101, 102, 103);
		empRepo.deleteAllById(asList);
	}
}
