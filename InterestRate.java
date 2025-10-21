/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interestrate;

import java.util.Scanner; 
import java.text.NumberFormat;

    public class InterestRate {
        
        
//Asks the user for their financial amount and the # of months 
        public static void main(String[] args) {
           Scanner scannerMonths = new Scanner(System.in);
            System.out.println("Please enter the amount of payment months: ");
           int months = scannerMonths.nextInt(); 
           Scanner scannerAmount = new Scanner(System.in);
            System.out.println("Please enter your financial amount: ");
           double initialAmount = scannerAmount.nextDouble(); 
           IntrestRateCalculator irc = new IntrestRateCalculator();
           irc.setInitialAmount(initialAmount);
           irc.setMonths(months);
           
//Formats the outputs and tells the user the total as well as the monthly payment 
           java.text.NumberFormat nf =
                    NumberFormat.getPercentInstance();
           System.out.println("The intrest rate is " + nf.format(irc.RATE));
           java.text.DecimalFormat df =
                    new java.text.DecimalFormat("##.##$");
           System.out.println("You will owe "+ df.format(irc.getMonthlyPayment()) + " every month");
           System.out.println("You will owe "+ df.format(irc.getTotalPayment()) + " in total");
           
        }

       

 }

//Initiates the IntrestRateCalculator class
    class IntrestRateCalculator {
        public final double RATE = 0.08;
        private int months = 0;
        private double initialAmount = 0.0;
        private double monthPayment = 0.0;
        private double total = 0.0;


//Sets months as well as the inital Amount given by the user 
        public void setMonths(int m){
            months = m;
        }
        public void setInitialAmount(double ia){
            initialAmount = ia;
        }
//Gets monthly Payments for the user
        public double getMonthlyPayment(){    
            monthPayment = initialAmount/months + ((initialAmount/months)*RATE); 
            return monthPayment; 
        }
//Gets the total amount owed by the user
        public double getTotalPayment(){
            total = getMonthlyPayment()*months;
            return total;
        }
    } 