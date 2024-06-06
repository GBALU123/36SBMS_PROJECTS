package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.service.ProductService;

@Controller
public class DemoController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome to Ashok IT..!!!");
		int i = 1/0;
		return "index";
	}
	
	@GetMapping("/greet")
	public String greetWelcomeMessage(Model model) {
		model.addAttribute("msg", "Good morning");
		return "index";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e) {
		System.out.println(e.getMessage());
		return "error";	}
}
