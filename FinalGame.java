/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalgame;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author mnovotny2027
 */
public class FinalGame {

    public static void main(String[] args) {
        int p = 0;
        int c = 0;
       Winner game = new Winner();
        Random randomPlay = new Random();
        //Rock Paper Scissors
        ArrayList choices = new ArrayList();
         choices.add("Rock");
         choices.add("Paper");
         choices.add("Scissors");
         //Planning:
        //Rock Paper Scissors
        //Need user input, conditionals, Arraylist of random computer options
        //Need to design Winner class that takes both computer and user choices
        //Rock beats Scissors, Paper beats Rock, Scissors beats Paper.
        //Loops util user or computer wins
        //Keeps track of score
      do{
       System.out.println("\n(Rock Paper Scissors: Best of 3!) Please enter your choice of Rock, Paper, or Scissors: ");
       Scanner userChoice = new Scanner(System.in);
       String userPlay = userChoice.next();
       int randomInt = 0;
       String computerChoice = "";
       
       
        if(choices.toString().toLowerCase().contains(userPlay.toLowerCase())){
            
           //Random number for computer play
           
          randomInt = randomPlay.nextInt(3);
          computerChoice = choices.get(randomInt).toString();
          System.out.println("\nNice! The Computer's choice is: " + choices.get(randomInt));
          
          
          game.setPlayerAndComputerChoice(userPlay, computerChoice);
          System.out.println(game.getPoint());
          
          //If user enters something other that paper, rock, or scissors, the errors will be accounted for
        }else if (!choices.toString().toUpperCase().contains(userPlay.toUpperCase())){
     do{
            userChoice = new Scanner(System.in);
            System.out.println("\nIt looks like you have not entered rock, paper, or scissors. Please check spelling and try again: ");
            userPlay = userChoice.next();
     }while(!choices.toString().toUpperCase().contains(userPlay.toUpperCase()));
     
          //Random number for computer play
          randomInt = randomPlay.nextInt(3);
          computerChoice = choices.get(randomInt).toString();
          System.out.println("Nice! The Computer's choice is: " + computerChoice);
          game.setPlayerAndComputerChoice(userPlay, computerChoice);
          System.out.println(game.getPoint());
     }
        //Keeps track of user score and computer score
        if(game.getPoint().equals("Computer Wins!")){
            c++;
            System.out.println("Computer's current Score: " + c);
            if(c == 3){
            System.out.println("\nComputer: Three Round Winner!");
                }
        }else if(game.getPoint().equals("You Win!")){
            p++;
            System.out.println("Your current Score: " + p);
            if(p == 3){
            System.out.println("\nYou: Three Round Winner!");
        }
        }
        
        
     }while(p != 3 && c != 3);
        }
    }


   //New class to compare results and output the winner
class Winner{
    private String playerChoice = "";
    private String computerChoice = "";
    private String winner = "";
    
    
    
        public void setPlayerAndComputerChoice(String plc, String cc){
           playerChoice = plc;
           computerChoice = cc;
        }
      
        //Gets the winner based on the computer and player choice
       public String getPoint(){    
            if (playerChoice.equalsIgnoreCase("scissors")){
      
               if(computerChoice.equalsIgnoreCase("rock")){
                  winner = "Computer Wins!"; 
               
               }
               else if(computerChoice.equalsIgnoreCase("scissors")){
                 winner = "Its a tie!";
            
               }
               else if(computerChoice.equalsIgnoreCase("paper")){
                 winner = "You Win!";
                 
                 }
               }
               
               else if (playerChoice.equalsIgnoreCase("rock")){
                 
              if(computerChoice.equalsIgnoreCase("paper")){
                  winner = "Computer Wins!";
              
               }
              else if(computerChoice.equalsIgnoreCase("rock")){
                 winner = "Its a tie!";
          
               }
              else if(computerChoice.equalsIgnoreCase("scissors")){
                 winner = "You Win!";
          
                 }
               }
               
               else if (playerChoice.equalsIgnoreCase("paper")){
              
              if(computerChoice.equalsIgnoreCase("scissors")){
                  winner = "Computer Wins!";
                 
               }
              else if(computerChoice.equalsIgnoreCase("paper")){
                 winner = "Its a tie!"; 
            
               }
              else if(computerChoice.equalsIgnoreCase("rock")){
                 winner = "You Win!";
                 
               }
          
             }
              
            
            //Returns winner
            return winner;
       }
     
                  
}   


       
      
    

