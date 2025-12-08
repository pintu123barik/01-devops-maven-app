package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessegeGenerator {
	@Autowired
private LocalTime lt;
	@Autowired
	private LocalDate ld;
	public WishMessegeGenerator() {
		System.out.println("WishMessegeGenerator.WishMessegeGenerator()- 0 param constuctor");
		
	}
	//b.method
	public String generateWishmessege(String user) {
		System.out.println("WishMessegeGenerator.generateWishmessege()"+lt+"----"+ld);
	int hour=lt.getHour();
	if(hour<12)
		return "good morning:"+user;
	else if(hour<16)
		return " good afternoon"+user;
	else if(hour<20)
		return " good evening"+user;
	else
		return " good night"+user;
	}
	
}
