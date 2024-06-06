package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddrRepo;
import in.ashokit.repo.EmployeeRepo;
import jakarta.transaction.Transactional;


@Service
public class EmployeeService {

	private EmployeeRepo empRepo;
	private AddrRepo addRepo;
	public EmployeeService(EmployeeRepo empRepo, AddrRepo addRepo) {
		super();
		this.empRepo = empRepo;
		this.addRepo = addRepo;
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void saveData() {
		
		Employee emp = new Employee();
		emp.setEname("balu");
		emp.setEsal(30000.00);
		
		Employee savedEntity = empRepo.save(emp);
		int i = 10/0;
		
		Address addr = new Address();
		addr.setCity("hyd");
		addr.setState("TS");
		addr.setCountry("ind");
		addr.setType("permanent");
		addr.setEmpid(savedEntity.getEid());
		addRepo.save(addr);
	}
	
	
	
}
