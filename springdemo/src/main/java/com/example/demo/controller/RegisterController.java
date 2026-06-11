package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}
	
	@PostMapping("/RegisterController")
	public String postRegister() {
		return "profile";
	}
}
