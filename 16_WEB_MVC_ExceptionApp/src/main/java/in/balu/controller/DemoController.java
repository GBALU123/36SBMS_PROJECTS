package in.balu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DemoController {

	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome to ashokit");
		int i = 1/0;
		return "index";
		
	}
	@GetMapping("/greet")
	public String greetMapping(Model model) {
		model.addAttribute("msg", "Good morning!");
		return "index";
		
	}
	
}
