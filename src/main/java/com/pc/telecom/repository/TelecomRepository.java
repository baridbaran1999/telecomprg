package com.pc.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pc.telecom.entity.TelecomEntity;
import com.pc.telecom.service.TelecomService;






@Repository
public interface TelecomRepository extends JpaRepository<TelecomEntity, Long> {

	

	

}
