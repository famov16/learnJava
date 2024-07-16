package com.famov;
import java.util.Properties;

public class SystemProperties{

  public static void main(String[] agrs){
    Properties p = System.getProperties();
    for(String s : p.stringPropertyNames()){	
      System.out.println(s + " = " + System.getProperty(s));
      
    }
  }

}