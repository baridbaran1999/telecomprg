package com.pc.telecom.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.pc.telecom.entity.TelecomEntity;
import com.pc.telecom.repository.TelecomRepository;

@Service
public class TelecomService {

	
	@Autowired
	private TelecomRepository telecomRepository;
	


	public TelecomEntity saveUser(TelecomEntity user)
	{
		return telecomRepository.save(user);
		
	}
	

}
