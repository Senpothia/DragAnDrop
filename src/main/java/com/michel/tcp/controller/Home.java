package com.michel.tcp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

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
	
	@PostMapping("/taches2")
	public String receptionPost(@RequestHeader String[] tachesID[]) {
		
		System.out.println("reçu!");
		return "ok";
	}


}
