package com.famov;

import java.util.Calendar;

public class DateParser{
  public static java.util.Date parseDate(String strDate){
    int date, month, year;

    if((strDate == null)|| (strDate.length() == 0))
      return null;
    int idx0 = strDate.indexOf('/');
    if(idx0 == -1)
      return null;
    String tmp = strDate.substring(0,idx0);

    date = Integer.parseInt(tmp);

    if((date <0) || (date >31))
      return null;

    int idx1 = strDate.indexOf('/', idx0+1);

    if(idx1 == -1)
      return null;

    tmp = strDate.substring(idx0+1,idx1);
    month = Integer.parseInt(tmp);
    if((month<1)|| (month>12))
      return null;

    tmp = strDate.substring(idx1+1);
    year = Integer.parseInt(tmp);
    if((year<1970)|| (year>2099))
      return null;	
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DATE, date);
    cal.set(Calendar.MONTH, month-1);
    cal.set(Calendar.YEAR, year);
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    
    return  cal.getTime();
  }
  public static void main (String[] args){
     java.util.Date d = parseDate("03/04/2020");
     System.out.println("d= "  + d );
  }

}