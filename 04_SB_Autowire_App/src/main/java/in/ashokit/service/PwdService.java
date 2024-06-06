package in.ashokit.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PwdService {

	public String encryptedpwd(String pwd) {
		
		// encrypted logic 
		
		System.out.println("pwd encryption completed");
		return pwd;
	}
}
