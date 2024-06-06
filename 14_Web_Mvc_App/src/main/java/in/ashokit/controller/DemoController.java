package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@GetMapping("/demo4")
	@ResponseBody
         public String getMsg4() {
		return  "Welcome to Ashok It....!!!!..";
        	 
         }
	
	@GetMapping("/demo3")
	public String getMsg3(Model model) {
		model.addAttribute("msg", "Hello,How are you");
		return "index";
	}
	
	@GetMapping("/demo2/{name}")
	public ModelAndView getMsg2(@PathVariable String  name) {
		
		String msgTxt = "Good Morning, "+ name ;
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgTxt);
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/demo1")
	public ModelAndView getMsg1(@RequestParam("name")String  name) {
		
		String msgTxt = "Hello, "+ name ;
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgTxt);
		mav.setViewName("index");
		return mav;
	}
}
