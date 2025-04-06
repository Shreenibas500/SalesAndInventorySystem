package com.SSinventory.genericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaUtility {
	public void systemDate() {
	 LocalDateTime now = LocalDateTime.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MMMM_yyyy_HH_mm_ss");
     String formattedDateTime = now.format(formatter);
     System.out.println(formattedDateTime);
	}
	

		public int getRandomNumber(int number) {
			Random rn = new Random();
			int randomNumber = rn.nextInt(number);
			return randomNumber;
		}
		
			
	  public String getRequiredDateMMDDYYYY() {
					
		LocalDate localDate = LocalDate.now(); // or LocalDate.of(year, month, day);
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    String formattedDate = localDate.format(formatter);
	  return formattedDate;
		
}
		
		public String getDateWithTime() {
	        LocalDateTime now = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	        String formattedDateTime = now.format(formatter);
			return formattedDateTime;
		}
}