package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class QuotesService {

	private  static final String QUOTES_URL= "https://type.fit/api/quotes";
	
	
	public void getQuotesv2() {
		
		WebClient client = WebClient.create();
		
		System.out.println("Rest api call started..");
		
		client.get()
		       .uri(QUOTES_URL)
		       .header("Accept", "application/json")
		       .retrieve()
		       .bodyToMono(String.class)
		       .subscribe(QuotesService::handleResponse);
		
		System.out.println("Rest api call completed...");
		
	}
	public static void handleResponse(String s) {
		System.out.println(s);
		
	}
	
	
	public void  getQuotesv1() {
		
		WebClient client = WebClient.create();
		System.out.println("Rest api call started..");
		
		Mono<String> bodyToMono = client.get()
		      .uri(QUOTES_URL) 
		      .retrieve()
		      .bodyToMono(String.class);
		
		System.out.println(bodyToMono.block());
		
		System.out.println("Rest api call completed..");
		
	}
	
}
