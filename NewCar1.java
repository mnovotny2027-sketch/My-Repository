/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newcar1;

/**
 *
 * @author mnovotny2027
 */
public class NewCar1 {
      //Sets up the variables
     public static void main(String[] args) {
        Car myCar1 = new Car("Tesla Model 3", 283, 145, 42000);
        System.out.println(myCar1);
        Car myCar2 = new Car("VW Bug", 207, 140, 20000);
        System.out.println(myCar2);
        Car myCar3 = new Car("Toyota Prius", 195, 115, 29000);
        System.out.println(myCar3);
        Car myCar4 = new Car("BMW i8", 300, 149, 145000);
        System.out.println(myCar4);
        Car myCar5 = new Car("Rivian");
        myCar5.setSpeed(135.0);
        myCar5.setEnginePower(120);
        myCar5.setPrice(30000);
        System.out.println(myCar5);
    /**
     * @param args the command line arguments
     */
     }
}
    
    class Car{
        private String carBrand = "";
        public Car(String inBrand){
            carBrand = inBrand;
        }
        private int enginePower = 0;
        public Car(int inEnginePower){
            enginePower = inEnginePower;    
        }
        private double maxSpeed = 0.0;
        public Car(double inMaxSpeed){
            maxSpeed = inMaxSpeed;
        }
        private double price = 0.0;
      
        
        public Car(String inBrand, int inPower, double inSpeed, double inPrice){
            carBrand = inBrand;
            enginePower = inPower;
            maxSpeed = inSpeed;
            price = inPrice;
        }
        
        public void setSpeed(double inSpeed){
            maxSpeed = inSpeed;
        }
        public void setEnginePower(int inEnginePower){
            enginePower = inEnginePower;
        }
         public void setPrice(int inPrice){
            price = inPrice;
        }
        
        public String toString(){
            String myString = "Brand: " + carBrand +
             ", Engine Power (Hp): " + enginePower + ", Max Speed (mph): " + maxSpeed +
             ", Price ($): " + price;
            return myString;
        }
    }
    
    

