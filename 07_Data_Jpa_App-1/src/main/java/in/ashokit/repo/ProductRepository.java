package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Product;

public interface ProductRepository  extends CrudRepository<Product, Integer>{

}
