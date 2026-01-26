/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class RadiusCalc {

    /**
     * @param args the command line arguments
     */
    //carry out calculations or circular items
    //such as a circle, a sphere, a cone, a column
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program calculates round item numbers such as \n" +
                "1 - Area of a circle (pi r^2)\n" +
                "2 - Volume of a sphere (4/3 pi r^3)\n" +
                "3 - Volume of a cone (pi r^2 h/3)\n" +
                "4 - Volume of a column (pi r^2 h)");
        System.out.println("Type the number for which one you want to calculate");
        
        int i = s.nextInt();
        if (i == 1){
            ACCalc1();
        }else if (i == 2){
            VSCalc2();
        }else if(i == 3){
            coneVConeCalc3();
        }else if(i == 4){
            columnVCalc4();
        }
    }
    
     public static void ACCalc1(){
        System.out.println("Enter the radius of your circle");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        double result = Math.PI * Math.pow(r, 2);
        System.out.println(result);
    }
     
     public static void VSCalc2(){
        System.out.println("Enter the radius of your sphere:");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        double result = ((4 * Math.PI)/3 * (Math.pow(r, 3)));
        System.out.println(result);
    }
     
    public static void coneVConeCalc3(){
        System.out.println("Enter the radius of your cone, then height of your cone:");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int h = s.nextInt();
        double result = (h * Math.PI)/3 * Math.pow(r, 2);
        System.out.println(result);
    }
    
    public static void columnVCalc4(){
        System.out.println("Enter the radius of your column, then height of your column");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int h = s.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h;
        System.out.println(result);
    }
    
   
}