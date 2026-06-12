package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class RegisterController {
	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}

	@PostMapping("/RegisterController")
	public String postRegister(@ModelAttribute User u, Model model) {

		model.addAttribute("fname", u.getFname());
		model.addAttribute("lname", u.getLname());
		model.addAttribute("username", u.getUsername());

		return "profile";
	}
}
