package com.chayab.fristApi.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
	    System.out.println("Hit");
		return "Success for the first time";
	}
}
