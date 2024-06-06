package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.employee;

public interface EmployeeRepo extends JpaRepository<employee, Integer> {

}
