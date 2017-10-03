package com.jorgesaldivar.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainGoodbyeController {

	@RequestMapping
	public String geGoodbye(@RequestHeader("x-location") String location) {
		return String.join(" ", "Goodbye!, from", location);
	}
	
	@RequestMapping("/enhanced")
	public String getGoodbyeEnhanced(@RequestParam(value="name", required=false) Optional<String> name) {
		return String.join(", ",name.orElse("Sir"), "goodbye from enhanced service.");
	}
	
}
