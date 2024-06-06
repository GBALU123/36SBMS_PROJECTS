package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Customer;
import in.ashokit.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerRepository customerRepo;
	

	@Override
	public String upsert(Customer customer) {
		customerRepo.save(customer);  
		return "success";
	}

	@Override
	public Customer getById(Integer customerId) {
		
		Optional<Customer> findById = customerRepo.findById(customerId);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Customer> getAllCourses() {
		 return customerRepo.findAll();
	
	}

	@Override
	public String deleteById(Integer cid) {
		
		if(customerRepo.existsById(cid)) {
			customerRepo.deleteById(cid);
			
			return "Delete Success";
		}else {
			return "No record found";
		}
		
		
	}

	
}
