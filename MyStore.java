/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mystore;
import java.text.DecimalFormat;
import java.util.Scanner; 
/**
 *
 * @author mnovotny2027
 */
public class MyStore {
     
    public static void main(String[] args) {
        final double MAX_BUDGET = 250.00;
        double totalSpent = 0.0;
        int start = 0;
        int count = 0;
        double total = 0.0;
        double remainder = 0.0;
          
      while(start!=-1){
           Scanner scan = new Scanner(System.in);
           System.out.println("Please enter your items: ");
               String scan1 = scan.next();
         
          
           Item shoes = new Item(125.99, "Shoes");
           Item tshirt = new Item(29.99, "T-Shirt");
           Item jeans = new Item(60.99, "Jeans");
           Item jacket = new Item(250.00, "Jacket");
           Item hat = new Item(25.99, "Hat");
           Item shorts = new Item(75.99, "Shorts");
           Item blouse = new Item(88.99, "Blouse");
           
         if (total <= MAX_BUDGET){
           if (scan1.equals("Shoes")){
               System.out.println(shoes);
               count++;
               System.out.println("New Item count: " + count);
               total = (total + shoes.getItemPrice()); 
               remainder = MAX_BUDGET - total; 
           java.text.DecimalFormat df =
                    new java.text.DecimalFormat("##.##$");
           System.out.println("New total: " + df.format(total) +"\nRemainder: " + df.format(remainder));
          
           }else if(scan1.equals("T-Shirt")){
               System.out.println(tshirt);
               count++;
               System.out.println("New Item count: " + count);
               total = (total + tshirt.getItemPrice()); 
               remainder = MAX_BUDGET - total; 
           java.text.DecimalFormat df =
                    new java.text.DecimalFormat("##.##$");
           System.out.println("New total: " + df.format(total) +"\nRemainder: " + df.format(remainder));
               
           }else if(scan1.equals("Jeans")){
               System.out.println(jeans);
               count++;
               System.out.println("New Item count: " + count);
               total = (total + jeans.getItemPrice()); 
               remainder = MAX_BUDGET - total; 
           java.text.DecimalFormat df =
                    new java.text.DecimalFormat("##.##$");
           System.out.println("New total: " + df.format(total) +"\nRemainder: " + df.format(remainder));
          
           }else if(scan1.equals("Jacket")){
               System.out.println(jacket);
               count++;
               System.out.println("New Item count: " + count);
                  remainder = MAX_BUDGET - total; 
           java.text.DecimalFormat df =
                    new java.text.DecimalFormat("##.##$");
           System.out.println("New total: " + df.format(total) +"\nRemainder: " + df.format(remainder));
              
           }else if(scan1.equals("Hat")){
               System.out.println(hat);
               count++;
               System.out.println("New Item count: " + count);
              remainder = MAX_BUDGET - total; 
           java.text.DecimalFormat df =
                    new java.text.DecimalFormat("##.##$");
           System.out.println("New total: " + df.format(total) +"\nRemainder: " + df.format(remainder));
              
           }else if(scan1.equals("Shorts")){
               System.out.println(shorts);
               count++;
               System.out.println("New Item count: " + count);
               total = (total + shorts.getItemPrice()); 
             remainder = MAX_BUDGET - total; 
           java.text.DecimalFormat df =
                    new java.text.DecimalFormat("##.##$");
           System.out.println("New total: " + df.format(total) +"\nRemainder: " + df.format(remainder));
              
           }else if(scan1.equals("Blouse")){
               System.out.println(blouse);
               count++;
               System.out.println("New Item count: " + count);
               total = (total + blouse.getItemPrice());
               remainder = MAX_BUDGET - total; 
           java.text.DecimalFormat df =
                    new java.text.DecimalFormat("##.##$");
           System.out.println("New total: " + df.format(total) +"\nRemainder: " + df.format(remainder));
       
            }
            }if (remainder <= 0.0){
              System.out.println("You should not exceeded the budget");
              start = -1;
           }
       
        
           }
          
      } 
    }
      
   
    
    

class Item{
       private double dblPrice = 0.0;
       private String strName = "";
       
       public Item(double ip, String in){
           dblPrice = ip;
           strName = in;
       }
       
        public double getItemPrice(){
          return dblPrice;
       }
        public void setItemPrice(double ip){
           dblPrice = ip;
        }
        public String getItemName(){
          return strName;
       }
        public void setItemName(String in){
           strName = in;
        }
        
    
        
        
       public String toString(){
           return "Item: " + strName + ", " + "Price: " + dblPrice + "$";
       
       
        
    }
   
}
    

