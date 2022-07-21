package com.gg.mytemplate.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/")
	public String getIndex() {
		return "Hello...Sample..Page!";
	}
	
	@GetMapping("/main")
	public String getMain() {
		return "Hello...Main..Page!";
	}
}
