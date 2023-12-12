package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Message;

@RestController
@RequestMapping("/ms")
public class ClientController  {
	

	@GetMapping(value = "/test") 
	public Message getdata(String input) throws Exception {
		
		return new Message(input,"Spring boot running:", "OK");
	}
	

}
