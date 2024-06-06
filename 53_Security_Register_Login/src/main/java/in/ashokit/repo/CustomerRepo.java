package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.Entity.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer>{
	
	public Customer findByuname(String uname);

}
