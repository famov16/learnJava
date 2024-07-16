package com.famov;
import java.lang.Math;
public class StringToInt{
 
 
 private static boolean isDigit(char c){
   return c>='0' && c <='9';
 }

 public static int toInt(String numberString){
   int number = 0;
   int exp = numberString.length()-1;
   boolean negative = numberString.charAt(0) == '-';

   for (int n=0; n<numberString.length(); n++){
       char c = numberString.charAt(n);      
       if(negative){
	negative = false;
        exp--;
	continue;
       }
       if(!isDigit(c))
         return 0;
       //number += ((c - '0') * Math.pow(10,exp));
       number = number *10 + (c - '0');
       exp--;       
   }
   if(numberString.charAt(0) == '-')
       return -number;
   return number;	
 }

  public static void main(String[] args){ 
    int num = toInt("-2022");
    System.out.println(num);
  }
}