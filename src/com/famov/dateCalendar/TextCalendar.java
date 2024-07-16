package com.famov.dateCalendar;

import java.time.LocalDate;

public class TextCalendar {
  
  private static final String DIVLINE = "+-----+-----+-----+-----+-----+-----+-----+";
  private static final String[] MONTHNAMES = {
	"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", 
	"Octubre", "Noviembre", "Diciembre"
  };
 
  public static void main (String[] args){
    LocalDate ld = LocalDate.now();

    System.out.println("+-----------------------------------------+");
    String title = MONTHNAMES[ld.getMonthValue()-1] + " " + ld.getYear();
    System.out.print("|");
    int x = 1;
    while(x<(DIVLINE.length()/2 - title.length()/2)){
      System.out.print(" ");
      x++;
    } 
    System.out.print(title);
    x += title.length();
    while(x<DIVLINE.length()-1){
      System.out.print(" ");
      x++;
    } 
    System.out.println("|");
    System.out.println(DIVLINE);
    System.out.println("| Dom | Lun | Mar | Mie | Jue | Vie | Sab |");
    System.out.println(DIVLINE);
    x=0;
    boolean pipe = false;
    int dayStart =ld.minusDays(ld.getDayOfMonth()-1).getDayOfWeek().getValue() %7; 
    if(x<dayStart){
      System.out.print("|");
      while (x<dayStart) {
	System.out.print("     |");
	x++;
	pipe = true;
      }
    }

    for (int n = 0 ; n<ld.lengthOfMonth(); n++) {
       if (x>6){
         System.out.println();
         x=0;
         pipe = false;
       }
       if(!pipe){
         System.out.print("|");
	 pipe = true;
       }
       if((n+1) == ld.getDayOfMonth())
	 System.out.printf(" [%2d]|", n+1); 
       else 
       	 System.out.printf("  %2d |", n+1);
       x++;
    }
    while(x<7) {
      System.out.print("     |");
      x++; 
    }
    System.out.println();

    System.out.println(DIVLINE);
  }

}




