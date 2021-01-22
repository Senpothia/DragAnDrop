package com.michel.tcp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
	
	@GetMapping("/")
	public String accueil() {
		
		return "index";
	}
	
	@GetMapping("/taches")
	public String reception() {
		
		System.out.println("reçu!");
		return "ok";
	}
	
	@GetMapping("/ok")
	public String reception2() {
		
		System.out.println("reçu!");
		return "ok";
	}


}
