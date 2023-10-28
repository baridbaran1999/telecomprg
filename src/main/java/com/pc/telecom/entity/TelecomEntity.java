package com.pc.telecom.entity;



import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


import lombok.Data;

@Entity
@Data
@Table(name="telecom")
public class TelecomEntity {

	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
    private Long id;
	
    private String firstName;
    private String middleName;
    private String lastName;
    private String UID;
    private String gender;
    private String country;
    private String state;
    private String dist;
    private String pin;
	
    @PrePersist
    public void generateUID() {
        if (UID == null) {
            UID = UUID.randomUUID().toString();
        }
    }

    
	
	
}
