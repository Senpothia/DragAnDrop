package com.michel.tcp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public String receptionPost(@RequestHeader("taches") String[] taches) {
		
		System.out.println("post: reçu!");
		for(int i=0; i<taches.length;i++) {
			
			System.out.println("tache1: " + taches[i]);
		}
		
		return "ok";
	}
	
	@PostMapping("/taches3")
	public  ResponseEntity receptionPost2(@RequestHeader("taches") String[] taches) {
		
		System.out.println("post: reçu!");
		for(int i=0; i<taches.length;i++) {
			
			System.out.println("tache1: " + taches[i]);
		}
		
		 return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}


}
