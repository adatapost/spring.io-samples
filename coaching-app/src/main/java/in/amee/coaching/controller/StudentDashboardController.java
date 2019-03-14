package in.amee.coaching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentDashboardController {
	
	@RequestMapping("/student")
	public String index() {
		return "student/dashboard/index";
	}

}
