package com.famov;
import java.util.Calendar;
 
public class DateParser2{
  public static java.util.Date parseDate(String strDate, String formatDate){
     int[] date = new int[3];
     if((strDate == null) || (strDate.length() == 0) || (formatDate == null) || (formatDate.length() == 0))
        return null; 
 
     String[] separateDate = strDate.split("/");
     String[] separateFormat = formatDate.split("/");
 
     if((separateDate.length == 0) || (separateFormat.length == 0) )
	return null; 	
 
     char c;
 
     for(int i = 0; i< separateFormat.length; i++ ){
	 c = separateFormat[i].charAt(0);
         switch(c){
 
	   case 'd':
 	     date[0] = Integer.parseInt(separateDate[i]);
	   break;
 
           case 'm':
	     date[1] = Integer.parseInt(separateDate[i]);
	   break;
 
	   case 'y':
	     date[2] = Integer.parseInt(separateDate[i]);	
	   break;
 
	   default:
	    return null;
	 }	    
     }
 
    if ((date[0]<1 ||date[0]>31) || (date[1]<1 ||date[1]>12) ) 
         return null;
 
    if (date[1] == 2 &&  date[0]>28) 
        return null;
 
 
    if (String.valueOf(date[2]).length()==2)
	date[2]+=2000;
 
    if (date[1] == 2 && (date[0] > 29 || (date[0] == 29 && !isLeapYear(date[2]))))
         return null;
 
     Calendar cal = Calendar.getInstance();
     cal.set(Calendar.DATE, date[0]);
     cal.set(Calendar.MONTH, date[1]-1);	
     cal.set(Calendar.YEAR, date[2]);
     cal.set(Calendar.HOUR_OF_DAY, 0);
     cal.set(Calendar.MINUTE, 0);
     cal.set(Calendar.SECOND, 0);
     cal.set(Calendar.MILLISECOND, 0);
    
    return  cal.getTime();
  }
 
  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }
  public static void main (String[] args){
     java.util.Date d = parseDate("29/02/2021" , "dd/mm/yyyy");
     java.util.Date d1 = parseDate("2020/01/20" ,"yyyy/mm/dd");
     java.util.Date d2 = parseDate("2015/02/29" ,"yyyy/mm/dd");
     java.util.Date d3 = parseDate("2014/02/28" ,"yyyy/mm/dd");
     java.util.Date d4 = parseDate("24/01/12", "yyyy/dd/mm");
     java.util.Date d5 = parseDate("1/4/20", "dd/mm/yyyy");
     java.util.Date d6 = parseDate("29/02", "dd/mm/yyyy");
     System.out.println("d= "  + d );
     System.out.println("d1= "  + d1 );
     System.out.println("d2= "  + d2 );
     System.out.println("d3= "  + d3 );
     System.out.println("d4= "  + d4 );
     System.out.println("d5= "  + d5 );
     System.out.println("d6= "  + d6 );
 
 
  }
 
}