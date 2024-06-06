package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public void saveProduct() {
		Product p = new Product();
		p.setProductName("mobile");
		p.setProductprice(10000);
		Product save = repo.save(p);
		System.out.println(save);
	}
}
