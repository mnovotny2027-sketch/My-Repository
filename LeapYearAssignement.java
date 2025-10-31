/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapyearassignement;

/**
 *
 * @author mnovotny2027
 */
import java.util.Scanner;

public class LeapYearAssignement {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        //Sets the boolean for the project
        boolean isLeapYear = false;
        System.out.println("Please enter the Year: ");
        final int MIN_YEAR = 1582;
        int year = scan1.nextInt();
        System.out.println("You entered the year: " + year);
        //Sets the minimum year to 1582
        if(year <= MIN_YEAR){
            isLeapYear = false; 
            System.out.println("The Gregorian clalander was not utlized yet!");
        //Determines if it us a leap year
        }else if ((year%4==0) || (year%100==0) && (year%400==0)){
            isLeapYear = true;
            System.out.println("This is a leap year!");
          
        }else{
            isLeapYear = false;
            System.out.println("Sorry, that is not a leap year!");
        
             
        }
       
    }
    
}
