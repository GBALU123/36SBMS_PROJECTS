package in.ashokit.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/welcome")
	public String getWelcome(Model model) {
		
		model.addAttribute("msg", "Good Morning");
		return "index";
	}
}
