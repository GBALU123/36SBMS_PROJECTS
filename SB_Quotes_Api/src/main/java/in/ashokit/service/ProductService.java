package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.response.Product;

@Service
public class ProductService {
	
	public Product getProduct(String productId) {
		
		String apiUrl = "https://api.restful-api.dev/objects/" +productId;
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Product> resEntity = rt.getForEntity(apiUrl, Product.class);
		
	int status = resEntity.getStatusCode().value();
		
		if(status == 200) {
			
			return resEntity.getBody();
		}
		
		return null;
		
		
	}
	


	public void getproducts() {
		
		String apiUrl = "https://api.restful-api.dev/objects";
		
		RestTemplate rt = new RestTemplate();
		
 ResponseEntity<Product[]> forEntity = rt.getForEntity(apiUrl, Product[].class);
		
		int value = forEntity.getStatusCode().value();
		
		if(value == 200) {
			
			 Product[] products = forEntity.getBody();
			
			for(Product p : products ) {
				System.out.println(p);
			}
		}
	}
}
