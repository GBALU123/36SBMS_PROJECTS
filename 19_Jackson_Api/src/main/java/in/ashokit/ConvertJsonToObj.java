package in.ashokit;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJsonToObj {

	public static void main(String[] args) throws Exception {
		
		File f = new File("customer.json");
		ObjectMapper mapper = new ObjectMapper();
		Customer customer = mapper.readValue(f, Customer.class);
		System.out.println(customer);
		
	
		
	}
}
