package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private double empSalary;
	private String empGender;
	private String empDeptm;
	public Employee(Integer empId, String empName, double empSalary, String empGender, String empDeptm) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empGender = empGender;
		this.empDeptm = empDeptm;
	}
	public Employee() {
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
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpDeptm() {
		return empDeptm;
	}
	public void setEmpDeptm(String empDeptm) {
		this.empDeptm = empDeptm;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empGender="
				+ empGender + ", empDeptm=" + empDeptm + "]";
	}
	
	
	
}
