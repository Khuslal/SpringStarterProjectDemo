package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@PostMapping("/LoginController")
	public String postLogin(@ModelAttribute User u, Model model) {
		if(u.getUsername().equals("admin") && u.getPassword().equals("admin")) {
			model.addAttribute("username", u.getUsername());
			return "home";
		}
		model.addAttribute("error", "Invalid username or password");
		return "login";
	}

}
