/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicleinheritance;

public class VehicleInheritance {

    
    public static void main(String[] args) {
        //base (Class wide) variables
     
      protected double speed = 0.0;
      protected String brandName = "";
      protected int passengers = 0;
      protected double cargoWeight = 0.0;
      //Base default constructor

      public Vehicle(){
      brandName = "";
      speed = 0.0;
      passengers = 0;
      cargoWeight = 0.0;
      }
      public Vehicle(String inBrand, double inSpeed, int inPassengers, double inCargo){
      brandName = inBrand;
      speed = inSpeed;
      passengers = inPassengers;
      cargoWeight = inCargo;
      }
      //getters and setters
      public Vehicle(String inBrand){
      brandName = inBrand;
      }
      public String getBrand(){
      return brandName;
      }
      public void setBrandName(String inBrand){
      brandName = inBrand;
      }
      public double getSpeed(){
      return speed;
      }
      public void setSpeed(double inSpeed){
      speed = inSpeed;
      }
      public int getPassengers(){
      return passengers;
      }
      public void setPassengers(int inPassengers){
      speed = inPassengers;
      }
      public double getCargoWeight(){
      return cargoWeight;
      }
      public void setCargoWeight(double inCargoWeight){
      cargoWeight = inCargoWeight;
      }
     
      //Base toString
      public String toString(){
      String result = "";
      result = "Brand: \t\t\t" + getBrand() + "\n" + getSpeed() + "\n" + "Passengers: \t" + getPassengers() + "\n" + "Cargo (lbs): \t" + getCargoWeight() + "\n";
      return result;
      }
      }
      //the Speedometer interface to show the speed of any vehicle in the same way
      interface Speedometer{
      public void setSpeed(double inSpeed);
      public double getSpeed();
      }