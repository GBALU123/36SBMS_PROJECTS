package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Customer;

public interface CustomerService {

	public String upsert(Customer customer);
	
	public Customer getById(Integer customerId);
	
	public List<Customer> getAllCourses();
	
	public String deleteById(Integer cid);
}
