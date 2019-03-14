package in.amee.coaching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InstituteDashboardController {
	
	@RequestMapping("/institute")
	public String index() {
		return "institute/dashboard/index";
	}
	@RequestMapping("/institute/course")
	public String course() {
		return "institute/dashboard/course";
	}

}
