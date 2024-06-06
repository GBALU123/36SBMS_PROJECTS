package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

	
	/* these methods are custom Queries */
	
	@Query("from Employee")
	public List<Employee> getEmpAllRecords();
	
	@Query("from Employee where empId = :id")
	public Employee getEmpById(Integer id);
	
	/* these methods are findByXXX methods */
	
	// select * from employee where emp_dept =:dept
	public List<Employee> findByEmpDeptm(String empDept);
	
	// select * from employee where emp_gender = : gender
	public List<Employee> findByEmpGender(String gender);
	
	// select * from employee where emp_gender = :gender and emp_dept = :dept
	
	public List<Employee> findByEmpDeptmAndEmpGender(String dept, String gender);
	
	// select * from employee where emp_salary >= 200000;
	public List<Employee> findByEmpSalaryGreaterThanEqual(float salary);
	
	@Query(value = "from Employee where empSalary>=:salary")
	public List<Employee> getEmpsDetails(Integer salary);
	
	
}
