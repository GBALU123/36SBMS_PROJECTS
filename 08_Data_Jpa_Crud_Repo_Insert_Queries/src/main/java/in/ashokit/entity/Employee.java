package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private String empSalary;

	

	public Employee() {
		
	}


	public Employee(Integer empId, String empName, String empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}
