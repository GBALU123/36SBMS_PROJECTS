package in.ashokit.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	
	public boolean sendEmail(String to,String subject, String body) {
		
		// send mail logic here
		System.out.println("Email sent to user");
		
		return true;
	}
}
