package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("service")
public class WishService {

	public String wish() {
		Calendar cal = null;
		int hour = 0;
		cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good AfterNoon";
		else if(hour<19)
			return "Good Evening";
		else
			return "GoodNight";
	}

}
