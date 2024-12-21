package com.jpa;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.Repository.Passport;
import com.jpa.Repository.PassportRepo;
import com.jpa.Repository.Person;
import com.jpa.Repository.PersonRepo;

@SpringBootApplication
public class OnetoOneExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ioc = SpringApplication.run(OnetoOneExampleApplication.class, args);
		PersonRepo pr = ioc.getBean(PersonRepo.class); //create bean for parent lass/ class
		
		PassportRepo p = ioc.getBean(PassportRepo.class);
		
//		Person per=new Person();
//		per.setPersonName("venkat");
//		per.setDateOfBrth(LocalDate.now());
//		
//		Passport pass=new Passport();
//		pass.setExpiredDate(LocalDate.now());
//		pass.setIssuedDate(LocalDate.now());
////		
//		
//		per.setPassport(pass);
//		pass.setPerson(per);
//		
//		pr.save(per);
		
		
		//pr.findById(1);
		p.findById(1);
		
	}

}
