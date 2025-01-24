package com.tka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Kesari")
public class SpringBootAPIcreation_throughSpring {

	@RequestMapping(value = "/India", method = RequestMethod.GET)
	public String FirstApi() {
		return "Welcome to India";
	}
	
	@RequestMapping(value="/Andaman", method = RequestMethod.POST)
	public String SecondApi() {
		return "Welcome to Andaman";
	}
	
	@RequestMapping(value="/Australia", method = RequestMethod.PUT)
	public String ThirdApi() {
		return "Welcome to Australia";
	}
	
	@RequestMapping(value="/America", method = RequestMethod.DELETE)
	public String FourthApi() {
		return "Welcome to America";
	}

}
