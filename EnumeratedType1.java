/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumeratedtype1;

import java.util.Scanner;

/**
 *
 * @author mnovotny2027
 */
public class EnumeratedType1 {

    enum Days {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
    enum Months {January, February, March, April, May, June, July, August, September, October, November, December}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Days day1, day2, day3, day4, day5, day6, day7;
    day1 = Days.Monday;
    day2 = Days.Tuesday;
    day3 = Days.Wednesday;
    day4 = Days.Thursday;
    day5 = Days.Friday; 
    day6 = Days.Saturday; 
    day7 = Days.Sunday;
    System.out.println("Days of the week 1-7: \n" + day1 + ": " + (day1.ordinal() + 1) + "\n" + day2 + ": " + (day2.ordinal() + 1) + "\n" + day3 + ": " + (day3.ordinal() + 1) + "\n" + day4 + ": " + (day4.ordinal() + 1) + "\n" + day5 + ": " + (day5.ordinal() + 1) + "\n" + day6 + ": " + (day6.ordinal() + 1) + "\n" + day7 + ": " + (day7.ordinal() + 1));
   
       Months months1, months2, months3, months4, months5, months6, months7, months8, months9, months10, months11, months12;
    months1 = Months.January;
    months2 = Months.February;
    months3 = Months.March;
    months4 = Months.April;
    months5 = Months.May; 
    months6 = Months.June; 
    months7 = Months.July;
    months8 = Months.August;
    months9 = Months.September;
    months10 = Months.October;
    months11 = Months.November;
    months12 = Months.December;
    System.out.println("\nMonths of the Year 1-12: \n" + months1 + ": " + (months1.ordinal() + 1) + "\n" + months2 + ": " + (months2.ordinal() + 1) + "\n" + months3 + ": " + (months3.ordinal() + 1) + "\n" + months4 + ": " + (months4.ordinal() + 1));
    System.out.println(months5 + ": " + (months5.ordinal() + 1) + "\n" + months6 + ": " + (months6.ordinal() + 1) + "\n" + months7 + ": " + (months7.ordinal() + 1) + "\n" + months8 + ": " + (months8.ordinal() + 1) + "\n" + months9 + ": " + (months9.ordinal() + 1));
    System.out.println(months10 + ": " + (months10.ordinal() + 1) + "\n" + months11 + ": " + (months11.ordinal() + 1) + "\n" + months12 + ": " + (months12.ordinal() + 1));
    
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("\nPlease enter your CCHS username: ");
    String username = scanner1.next();
    String gradDate = username.substring(username.length() -4);
    System.out.println(gradDate);
    int num = Integer.parseInt(gradDate);
    System.out.println("The Year after you graduate will be: " + (num + 1));
    
    String num2 = Integer.toString(num);
    num2 = Integer.toBinaryString(num);
    System.out.println("In computer language, you graduated in " + num2);
   
            
    
    
    
    }
    
}
