/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppinglist;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author mnovotny2027
 */
public class ShoppingList {

    
    public static void main(String[] args) {
        ArrayList shopping = new ArrayList();
        String item = new String(" ");
        int removeLocation = 0;
        int count = 0;
        String start = "";
        int i = 0;

       
        
          
        while (!item.equalsIgnoreCase("End")){
            
         Scanner scanner1 = new Scanner(System.in);
           System.out.println("\nPlease enter an item: ");
           item = scanner1.next();
           shopping.add(item);
           count++;
           i = 0;
           System.out.println("New list: " + shopping);
           while(i < count){
             System.out.println(i+ " " + shopping.get(i));
             i++;
           }
          
        
        
    
            if(item.equalsIgnoreCase("End")){
               
                shopping.removeLast();
                 System.out.println("\nYour list:" + shopping);
                Scanner scanner2 = new Scanner(System.in);
               
            System.out.println("Please enter the Item index you wish to remove");
            removeLocation = scanner2.nextInt();
            shopping.remove(removeLocation);
            System.out.println("Your new Final list: " + shopping);
            
            
            }
        }    
    }
}
          
        
    

        
       
           

    
    




