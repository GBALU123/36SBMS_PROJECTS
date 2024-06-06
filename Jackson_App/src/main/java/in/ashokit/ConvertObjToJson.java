package in.ashokit;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjToJson {

	public static void main(String[] args) throws Exception {
		
		// Convert obj to json format
				Customer c = new Customer(101, "John", "john@gmail.com");

				ObjectMapper mapper = new ObjectMapper();
				mapper.writeValue(new File("customer.json"), c);

				System.out.println("completed....");
	}
}
