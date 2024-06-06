package in.ashokit.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

	@GetMapping("/welcome")
	public String getWelcme(Model model) {
		model.addAttribute("msg", "welcome to Spring Boot And MicroServices");
		return "index";
	}
}
