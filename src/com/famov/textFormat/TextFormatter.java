package com.famov.textFormat;
import java.util.StringTokenizer;
public class TextFormatter{


  public static String formatText(String str, int width){
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(str);  
    int curPos = 0;
    boolean space= false;
    for(int n=0; n<width; n++){
      sb.append(((n+1)%10 == 0)? ((n+1)/10)%10 : " ");
    }
    sb.append("\n");
    for(int i = 0 ; i<width; i++){
     sb.append((i+1)%10);
    } 
    sb.append("\n");
    for(int i = 0 ; i<width; i++){
      sb.append("-");
    } 
    sb.append("\n"); 
    /*while(st.hasMoreTokens()){
      String s = st.nextToken();
      if(curPos + s.length()<width){
	curPos += s.length();
        if (space){
          System.out.print(" ");
          curPos++;
        }
        System.out.print(s);
        space = true;
      }else{    
        System.out.println(" ");
        System.out.print(s);
        curPos =s.length();
      }
    }*/

    while(st.hasMoreTokens()){
      String s = st.nextToken();
      if(curPos + s.length()>width){
	sb.append("\n");
        curPos = 0;
        space = false;
      }     

        if (space){
          sb.append(" ");
        }

        sb.append(s);
        curPos += s.length()+1;
        space = true;
      
    }
   return sb.toString();
  } 
 


  public static void main(String[] args){
	   
    String str = "No cabe duda que la parte más importante de cualquier lenguaje de programación es saber cómo manejar las variables alfanumericas, porque finalmente, cualquier programa realiza una acción para un usuario, y como tal hay que comunicarse, y si no hubiera mensajes de texto, ¿cómo te comunicarías?."; 
    int width  = 45;
  
    System.out.println(formatText(str, width));
 }
}




