package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Modifying
	@Query(value="insert into Employee(empId) values(:eid)")
	public void insertEmp(Integer eid);

}
