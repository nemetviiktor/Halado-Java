package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MainController {
	
	@GetMapping("hello")
	@ResponseBody
	public String hello() {
		return String.format("hello %s", new Date().toString());
	}
}
