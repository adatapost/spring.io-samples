package in.amee.coaching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminDashboardController {
	
	@RequestMapping("/admin")
	public String index() {
		return "admin/dashboard/index";
	}

}
