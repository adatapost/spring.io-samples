package com.adc.basic;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model) {
		 model.addAttribute("name", "The Appleman Pvt Ltd");
		 model.addAttribute("now", java.time.ZonedDateTime.now());
		 return "index"; 
		
	}
}
