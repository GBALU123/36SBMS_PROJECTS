package in.ashokit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	
	public WelcomeController() {
		System.out.println("welcomeController:: constructor");
	}
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		System.out.println("getWelcomeMsg():: method executed!!..");
		
		mav.addObject("msg1", "wlecome to AshokIT");
		mav.addObject("msg2", "good morning...");
		mav.setViewName("index");
		return mav;
		
	}
	@GetMapping("/date")
	public ModelAndView getDate() {
		ModelAndView mav = new ModelAndView();
		System.out.println("getDate()..method executing");
		mav.addObject("date", new Date());
		mav.setViewName("index");
		return mav;
		
	}
}
