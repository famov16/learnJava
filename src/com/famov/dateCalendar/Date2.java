package com.famov.dateCalendar;
import java.util.Calendar;

public class Date2 {
  public static void main(String[] args){
	Calendar cal = Calendar.getInstance();
	System.out.println(cal.getTime());
	cal.add(Calendar.DATE, 1);
	cal.add(Calendar.HOUR, 1);
	System.out.println(cal.getTime());	

	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);
	int day = cal.get(Calendar.DATE);

	System.out.printf("day : %d\n", day);
	System.out.printf("month : %d\n", month);
	System.out.printf("year : %d\n", year);
  }

}
