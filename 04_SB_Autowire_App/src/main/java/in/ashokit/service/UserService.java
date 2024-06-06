package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.ashokit.Dao.IUserDao;

@Service
public class UserService {

	//field injection
	@Autowired
	private PwdService pwdService;
	
    @Autowired
	private IUserDao userDao;
	
    @Autowired
	private EmailService emailService;
	
	
	// constructor Injection for creating IOC object
	//==================================================
	/*public UserService() {
		System.out.println("0-param constructor");
	}
	@Autowired
	public UserService(PwdService pwdService, IUserDao userDao, EmailService emailService) {
		this.pwdService = pwdService;
		this.userDao = userDao;
		this.emailService = emailService;
		System.out.println("3-Org Constructor...");
	}
	*/
	
	// setter injection for creating IOC object
	//=========================================
/*	@Autowired
	public void setPwdService(PwdService pwdService) {
		this.pwdService = pwdService;
	}

     @Autowired
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

     @Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	*/


	

	public void registeruser(String name,String email, String pwd) {
		
		// encrypted pwd
		
		String encryptedpwd = pwdService.encryptedpwd(pwd);
		
		// save user in db
		boolean issaved = userDao.saveUser(name, email, encryptedpwd);
		
		
		// sent email
	if (issaved) {
		boolean issent = emailService.sendEmail(email, "To subject", "To body");
		if (issent) {
			System.out.println("User registration successfull....");
		}
	}
	}
}
