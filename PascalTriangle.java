/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pascaltriangle;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author mnovotny2027
 */
public class PascalTriangle {
    
    //Intakes the int and row
    public static int pascal(int row, int col){
        if (col == 0 || col == row){
        return 1;
    }
    return pascal(row - 1, col - 1) + pascal(row -1, col);
}
  //Asks the user for thir dsired lines for Pascal's Triangle
    
    public static void main(String[] args) {
        System.out.print("Enter your desired line of Pascal's Triangle: ");
        Scanner n = new Scanner(System.in);
        int rows =  n.nextInt();
        
        
   
      //Outputs the numbers 
        for (int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                
                System.out.print(pascal(i,j) + " ");
            }
            System.out.println();
            }
  
    System.out.println(rows);
}
}




