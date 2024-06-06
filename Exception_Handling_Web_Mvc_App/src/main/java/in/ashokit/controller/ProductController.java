package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	
	@GetMapping("/product")
	public String geProductMsg(Model model) {
	   String name = service.getName();
	  model.addAttribute("msg", name);
		return "errorview";
	}
	}
