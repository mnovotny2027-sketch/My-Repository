/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playingcards;

import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author mnovotny2027
 */
public class PlayingCards {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
      
       ArrayList<String> deck = new ArrayList<>();
        
      String[][] playingCards = new String[4][13];
            Random rand = new Random();
            String suit = "";
            
          for (int i = 0; i < 4; i++){
              if (i==0)
                  suit = "Diamonds";
              else if (i==1)
                  suit = "Hearts";
              else if (i==2)
                  suit = "Clubs";
              else if (i==3)
                  suit = "Spades";
              for (int j = 0; j < 13; j++){
                  playingCards[i][j] = (j + 1) + " of " + suit;
                
                  deck.add(playingCards[i][j]);
                  
              }
             
          }
          System.out.println("\nDeck 1: ");
          while (deck.size() > 47) {
          int cards = rand.nextInt(deck.size());
          System.out.println(deck.get(cards));
          deck.remove(cards);
          }
          System.out.println("\nDeck 2: ");
          while (deck.size() > 42) {
          int cards = rand.nextInt(deck.size());
          System.out.println(deck.get(cards));
          deck.remove(cards);
          }
          System.out.println("\nDeck 3: ");
          while (deck.size() > 37) {
          int cards = rand.nextInt(deck.size());
          System.out.println(deck.get(cards));
          deck.remove(cards);
          }
          System.out.println("\nDeck 4: ");
          while (deck.size() > 32) {
          int cards = rand.nextInt(deck.size());
          System.out.println(deck.get(cards));
          deck.remove(cards);
          }
         
            
    }
}
    

