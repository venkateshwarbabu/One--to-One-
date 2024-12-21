package com.jpa.Repository;


import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	
	private String personName;
	
	private LocalDate dateOfBrth;
	
	//by default for one2one fetch type is lazy -> it means when ever we select the only parent class should fetch(select)
	//fetchtype.EAGER--> it means when parent record loaded automatically the child record will also load
	//casecade-it is for non select operations (insert,update,delete)
	@OneToOne(mappedBy= "person",cascade=CascadeType.ALL,fetch=FetchType.LAZY)	//it means make relation with the that annotation
	private Passport passport;  //class reference variable

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public LocalDate getDateOfBrth() {
		return dateOfBrth;
	}

	public void setDateOfBrth(LocalDate dateOfBrth) {
		this.dateOfBrth = dateOfBrth;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	
	
	
	
	

}
