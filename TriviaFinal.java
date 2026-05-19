/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triviafinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mnovotny2027
 */
public class TriviaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
           System.out.println("Welcome to Animal Trivia! You will need to grab a partner \nand agree on the first catagory together.\nTry to get as many points and possible and use powerups! Good Luck!");
            
           Player player1 = new Player("Player 1");
           Player player2 = new Player("Player 2");
            
           Scanner input = new Scanner(System.in);
            
               String filePath = "";
         
          System.out.println("\nPlease select the trivia Category: " +
                  " 'c' = Cats"
                  + " 'd' = Dog"
                  + " 'b' = Birds");
            String choice = input.nextLine();
           
            
             if (choice.equals("b")){
                  filePath = "Bird/bird.txt";
             }else if (choice.equals("d")){
                  filePath = "Animal/dog.txt";
             }else if (choice.equals("c")){
                  filePath = "Animal/cat.txt";  
             }else{
                 System.out.println("Invalid choice");
                return;
             }
             
             try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String question;
            String choiceA, choiceB, choiceC, choiceD;
            String correctAnswer;
            
            
            while ((question = reader.readLine()) != null) {
               choiceA = reader.readLine();
               choiceB = reader.readLine();
               choiceC = reader.readLine();
               choiceD = reader.readLine();
               correctAnswer = reader.readLine();
               
             if(correctAnswer == null) {
                 break;
             }
               
             System.out.println("\n" + question);
             System.out.println(choiceA);
             System.out.println(choiceB);
             System.out.println(choiceC);
             System.out.println(choiceD);
             
             System.out.println("Player 1: do you want to use a power-up? (y/n)");
             String plUse = input.nextLine();
            
             
             if(plUse.equalsIgnoreCase("y")){
                 PowerUp p1Power = player1.choosePowerUp(input);
                 if (p1Power != null){
                     p1Power.apply(player1);
                 }
             }
             
              
             System.out.println("Player 2: do you want to use a power-up? (y/n)");
             String p2Use = input.nextLine();
             
              if(p2Use.equalsIgnoreCase("y")){
                 PowerUp p2Power = player2.choosePowerUp(input);
                 if (p2Power != null){
                     p2Power.apply(player2);
                 }
             }
             
              
       
            String player1Answer = "";
            
            String player2Answer = "";
          
             
             
              if(player1.shouldSkip()){
                  System.out.println("Player 1 skipped the question!");
              } else {
                  System.out.println("Player 1 answer: ");
                  player1Answer = input.nextLine();
                  
               if (player1Answer.equalsIgnoreCase(correctAnswer)){
                  if (player1.useDoublePoints()){
                      player1.addPoints(2);
                      System.out.println("Double points earned!");
                  } else {
                      player1.addPoints(1);
                  }
                   
                   
               }else {
                   player1.addPoints(0);
                   
               }
              }
               
            
               
              if(player2.shouldSkip()){
                  System.out.println("Player 2 skipped the question!");
                  System.out.println("The answer was: " + correctAnswer);
              } else {
                  System.out.println("Player 2 answer: ");
                  player2Answer = input.nextLine();
                  
               if (player2Answer.equalsIgnoreCase(correctAnswer)){
                  if (player2.useDoublePoints()){
                      player2.addPoints(2);
                      System.out.println("Double points earned!");
                  } else {
                      player2.addPoints(1);
                  }
                   System.out.println("The answer was: " + correctAnswer);
                   
               }else {
                   player2.addPoints(0);
                   System.out.println("The answer was: " + correctAnswer);
               }
              }
               
               
            }
         System.out.println("\nGame over!");
         System.out.println(player1);
         System.out.println(player2);
            
            } catch (IOException e){
         System.out.println("No existing file found. Starting fresh.");
     }
            input.close(); 
    }
}
    
class Player
{
private String name;
private int points;

private boolean skipNext = false;
private boolean doublePoints = false;

private ArrayList<PowerUp> powerUps = new ArrayList<>();


    public Player(String name) {
        this.name = name;
        this.points = 0;
        
        
        powerUps.add(new DoublePoints());
        powerUps.add(new SkipQuestion());
   
}
public void addPoints(int amount){
    points += amount;
}
public void activateSkip(){
    skipNext = true;
}

public boolean shouldSkip(){
    if(skipNext) {
        skipNext = false;
        return true;
    }
    return false;
}

public String getName()
{
return name;
}

public int getPoints()
{
return points;
}

public boolean useDoublePoints(){
    if(doublePoints){
        doublePoints = false; 
        return true;
    }
    return false;
}

public PowerUp choosePowerUp(Scanner input){
    if(powerUps.isEmpty()) {
        
        System.out.println(name + "has no power-ups left.");
        return null;
    }
    System.out.println(name + " Power-ups");
    for(int i =0; i < powerUps.size(); i++){
        System.out.println(i + ":" + powerUps.get(i).getName());
    }
    System.out.println("Choose power-up number (or -1 for none): ");
    int choice = input.nextInt();
    input.nextLine();
    
    if (choice < 0 || choice >= powerUps.size()){
        return null;
    }
    return powerUps.remove(choice);
}

public String toString()
{
return name + "\t" + points;

}
}


abstract class PowerUp {
    protected String name;
    
    public PowerUp(String name) {
        this.name = name; 
    }
    public String getName(){
        return name;
    }
 
    public abstract void apply(Player player);
    }

class DoublePoints extends PowerUp {
        public DoublePoints() {
            super("Double Points");
        }
        @Override
        public void apply(Player player) {
            player.addPoints(player.getPoints());
            
            System.out.println(player.getName() + " activated Double Points!");
        }
}
class SkipQuestion extends PowerUp{
    public SkipQuestion(){
        super("Skip Question");
    }
    @Override
    public void apply(Player player) {
        player.activateSkip();
        
        System.out.println(player.getName() + " will skip this question!");
    }
}
 
     



