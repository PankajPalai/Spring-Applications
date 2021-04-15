package com.pk.beans;

import java.util.Date;
//Setter injection
public class WishMessageGenerator {
	   
	Date dty;
	
/**	
 * the injection will be based on setter method name ie; we need to pass setter method name as
 * property value
 * <property name="dates" ref="dt" />  */
	public void setDates(Date dt) {
		this.dty = dt;
	}
	
	

	public String generateWishMessage(String user) {
		int hours=dty.getHours();
		if(hours<12)
			return "Good Morning :"+user;
		else if(hours<17)
			return "Good Afternoon :"+user;
		else if(hours<20)
			return "Good Evening :"+user;
		else
			return "Good Night :"+user;
	}

}
