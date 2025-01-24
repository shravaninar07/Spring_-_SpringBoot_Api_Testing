package com.tka;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/WorldTour")
public class API_creation_through_SpringBoot {
	
	@GetMapping("/Andaman-Nicobar")
	public String FirstTour() {
		return "This is Andaman";
	}
	
	@PostMapping("/India")
	public String SecondTour() {
		return "Here it is India";
	}
	
	@PutMapping("/Germany")
	public String ThirdTour() {
		return "This is Germany";
	}
	
	@DeleteMapping("/Africa")
	public String FourthTour() {
		return "Here  it is Africa";
	}

}
