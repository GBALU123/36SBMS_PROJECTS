package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	public UserController() {
		System.out.println("Usercontroller : constructor..");
	}
	@GetMapping("/user")
	public ModelAndView getUserDetails() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("id", 101);
		mav.addObject("name", "balu");
		mav.addObject("email", "balu@gmail.com123");
		
		mav.setViewName("user");
		return mav;
		
	}
	
}
