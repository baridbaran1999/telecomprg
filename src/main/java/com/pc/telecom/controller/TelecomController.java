package com.pc.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pc.telecom.entity.TelecomEntity;
import com.pc.telecom.service.TelecomService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class TelecomController {

	 @Autowired
	    private TelecomService telecomService;
	 
	    @PostMapping("/users")
	    public ResponseEntity<TelecomEntity> createUser(@RequestBody TelecomEntity user) {
	    	TelecomEntity savedUser = telecomService.saveUser(user);
	        return ResponseEntity.ok(savedUser);
	    }

}
