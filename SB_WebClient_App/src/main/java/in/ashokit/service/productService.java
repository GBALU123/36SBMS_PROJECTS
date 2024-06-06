package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Product;
import reactor.core.publisher.Mono;

@Service
public class productService {

	public Mono<Product> getProductNew(){
		
		String apiUrl = "https://api.restful-api.dev/objects/2";
		WebClient webClient = WebClient.create();
		
		return  webClient.get()
		         .uri(apiUrl)
		         .retrieve()
		         .bodyToMono(Product.class);
	              
	}
	
	public Mono<String> getProduct(String pid) {
		
		String apiUrl = "https://api.restful-api.dev/objects/2";
		
		//// getting webclient impl class obj
		WebClient webClient = WebClient.create();
		
		   Mono<String> bodyToMono = webClient.get()//send GET req
		         .uri(apiUrl)//provider url
		         .retrieve()//get response body
		         .bodyToMono(String.class);//map respons
		
		   return bodyToMono;
		
		
	}
	
}
