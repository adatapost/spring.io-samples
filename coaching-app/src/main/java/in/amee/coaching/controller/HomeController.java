package in.amee.coaching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import in.amee.coaching.model.UserProfile;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "home/index";
	}

	@RequestMapping("/about")
	public String about() {
		return "home/about";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "home/contact";
	}

	@RequestMapping("/login")
	public String login() {
		return "home/login";
	}

	@RequestMapping("/logout")
	public String logout() {
		return "home/logout";
	}

	@GetMapping("/register")
	public String register() {
		return "home/register";
	}

	@PostMapping("/register")
	public String register(MultipartFile file, UserProfile profile) {
		return "home/register";
	}

	@RequestMapping("/recover")
	public String recover() {
		return "home/recover";
	}
	
}
