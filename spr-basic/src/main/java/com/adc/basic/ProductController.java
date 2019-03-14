package com.adc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	@GetMapping("/products")
    public String index(Model model) {
		model.addAttribute("name", "Reena");
		model.addAttribute("cities", new String[] {"Mehsana","Patan", "Rajkot"});
		var list = new java.util.ArrayList<String>();
		list.add("Reena");
		list.add("Seema");
		list.add("Seeta");
		model.addAttribute("people", list);
		
		return "products";
    }
	
	
}
