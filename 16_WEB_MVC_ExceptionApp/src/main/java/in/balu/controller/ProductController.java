package in.balu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ProductController {
	@GetMapping("/product")
	public String getProductName(Model model) {
		model.addAttribute("msg", "This is samsung laptop!");
		String s = null;
		s.length();
		return "index";
}
}
