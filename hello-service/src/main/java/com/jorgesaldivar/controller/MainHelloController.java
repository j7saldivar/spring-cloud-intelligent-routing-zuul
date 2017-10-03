package com.jorgesaldivar.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainHelloController {

	@RequestMapping
	public String getHello(@RequestHeader("x-location") String location) {
		return String.join(" ", "Hello!, from", location);
	}
	
	@RequestMapping("/enhanced")
	public String getHelloEnhanced(@RequestParam(value="name", required=false) Optional<String> name) {
		return String.join(", ",name.orElse("Sir"), "hello from enhanced service.");
	}
	
}
