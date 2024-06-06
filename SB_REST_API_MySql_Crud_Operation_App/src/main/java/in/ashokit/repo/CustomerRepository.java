package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer>{

}
