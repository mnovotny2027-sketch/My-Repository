/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doforloops;

/**
 *
 * @author mnovotny2027
 */
public class DoForLoops {

    public static void main(String[] args){

    final int MAX_ROWS = 10;
    //Problem a.
    System.out.println("a.");
    for (int row = 1; row <= MAX_ROWS; row++){

    for (int star = 10; star >= row; star--){
    System.out.print("*");
    }
    System.out.println();
      }
    
    //Problem b.
    System.out.println();
    System.out.println("b.");
      for (int row = 1; row <= MAX_ROWS; row++){
         
  for (int spaces = 10; spaces >= row; spaces--){
        System.out.print(" ");
    }

    for (int star = 1; star <= row; star++){
    System.out.print("*");
    }
     System.out.println();
      }
      
    //Problem c.
      System.out.println();
      System.out.println("c.");
    for (int row = 1; row <= MAX_ROWS; row++){
        
        
    for (int spaces = 1; spaces <= row; spaces++){
        System.out.print(" ");
    }
    for (int star = 10; star >= row; star--){
    System.out.print("*");
    }
    System.out.println();
     }
    
    //Problem d.
     System.out.println("d.");
    for (int row = 1; row <= 5; row++){
        
    for (int spaces = 1; spaces <= MAX_ROWS-row; spaces++){
        System.out.print(" ");
        
    }
  
    for (int star = 1; star <= 2*row-1; star++){
        System.out.print("*");
    
    }
    
    System.out.println(); 
    
    }
    
    

    for (int row = 5; row >= 1; row--){
        
    for (int spaces = 1; spaces <= MAX_ROWS-row; spaces++){
        System.out.print(" ");
        
    }
  
    for (int star = 1; star <= 2*row-1; star++){
        System.out.print("*");
    
    }
    
    System.out.println();
}
}
}


