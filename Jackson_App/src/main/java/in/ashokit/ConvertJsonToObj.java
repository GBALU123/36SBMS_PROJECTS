package in.ashokit;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJsonToObj {

	public static void main(String[] args)  throws Exception{

		// convert json to java object
		File f = new File("customer.json");
		ObjectMapper mapper = new ObjectMapper();
		Customer c = mapper.readValue(f, Customer.class);
		System.out.println(c);
		
	}
}
