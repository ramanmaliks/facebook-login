package com.facebook.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	   public String home() {
		return " Hi This is Facebook Login Project !!";
	   }

	@GetMapping("/prevent")
	   public Principal prevent(Principal principal) {
	      return principal;
}
}