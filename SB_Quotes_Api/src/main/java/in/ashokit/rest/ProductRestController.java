package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.response.Product;
import in.ashokit.service.ProductService;

@Controller
public class ProductRestController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/product")
	public String getProduct(@RequestParam("pid")String pid,Model model) {
		
		Product product = service.getProduct(pid);
		
		model.addAttribute("p", product);
		return "index";
	}

	
	@GetMapping("/")
	public String index(@ModelAttribute("p")Product p,Model model) {
		return "index";
	}
	
}
