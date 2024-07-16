package com.famov;

public class TextGraph{
  private char[][] canva;
  
  public TextGraph(int rows, int cols){
    canva = new char[rows][cols];
    clearCanva();
    rectangle(0,0,cols,rows);
  } 
  public int getWidth(){
    return canva[0].length;
  }
  public int getHeight(){
    return canva.length;
  }
  public void clearCanva(){
    for (int i = 0; i < canva.length; i++) {
         for (int j = 0; j < canva[i].length; j++) {
                canva[i][j] = ' ';
            }
     }
  }
  
  public void setCharAt(int row, int col , char value){   
     if((row>=canva.length || col>=canva[row].length) || (row<0 || col < 0) )
       return;
     canva[row][col] = value;
  }  
   
  public void rectangle(int x, int y, int width,  int height){    
    int printCols = x + width - 1;
    int printRows = y + height - 1;

    for (int col = x; col <= printCols; col++) {
        setCharAt(y, col, '-');     
        setCharAt(printRows, col, '-'); 
    }
    for (int row = y + 1; row <= printRows; row++) {
        setCharAt(row, x, '|');       
        setCharAt(row, printCols, '|');   
    }
    setCharAt(y,x, '+');
    setCharAt(printRows,printCols, '+');  
    setCharAt(y,printCols, '+'); 
    setCharAt(printRows,x, '+'); 
  	
  }

  public void printCanva(){
    for(int i=0; i<canva.length; i++){
 	System.out.println(canva[i]);
    } 
  }
  
  public static void main(String[] args){
     TextGraph tg = new TextGraph(25,80);
     for(int i = 0; i< tg.getWidth(); i++){
         double y =  Math.sin(Math.toRadians((2*360)/tg.getWidth())*i);
	 y = y*((tg.getHeight()/2)-2);
	 tg.setCharAt((int)(tg.getHeight()/2 -y), i, 'x');
     } 
	
     tg.printCanva();
  }

}