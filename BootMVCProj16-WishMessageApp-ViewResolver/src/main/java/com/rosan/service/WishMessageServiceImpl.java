package com.rosan.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String generateWishMessage() {
		LocalDateTime ldt = LocalDateTime.now();
		// get current hour of the day
		int hour = ldt.getHour();
		if(hour<12) return "Hello there, Good Morning";
		else if(hour<16) return "Hello there, Good Afternoon";
		else if(hour<20) return "Hello there, Good Evening";
		else return "Good Night";
	}

}
