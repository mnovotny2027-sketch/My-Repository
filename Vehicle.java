/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicle;

/**
 *
 * @author mnovotny2027
 */
public abstract class Vehicle implements Speedometer {

    
    public static void main(String[] args) {
        System.out.println("-----Cars------");
        System.out.println("Family Car: ");
        Car SUV = new Car("Lexus", 150.0, 4, 1000.0, 40.0, "Blue");
        System.out.println(SUV + "\n");
        System.out.println("Race Car: ");
        RaceCar McLaren = new RaceCar("F1", 400.0, 1, 1000.0, 100.0, "Orange", "Carbon Fiber", 50);
        System.out.println(McLaren + "\n");
        System.out.println("Fire Engine: ");
        FireEngine Doge = new FireEngine("Pierce Manufacturing", 100.0, 8, 3000.0, 40.0, "Red", 200, "Yes");
        System.out.println(Doge + "\n");
        System.out.println("-----Boats------");
        System.out.println("Yachts: ");
        Boat Yacht = new Boat("Catalina Yachts", 250.0, 6, 5000.0, "Steel", "4 Blade Rudder");
        System.out.println(Yacht + "\n");
        System.out.println("Submarines: ");
        Submarine Ballistic = new Submarine("Lockheed Martin", 500.0, 20, 10000.0, "Titanium", "8 Blade Rudder", 20.0, "2");
        System.out.println(Ballistic + "\n");
        System.out.println("-----Airplanes------");
        System.out.println("Travel Planes: ");
        Airplane Cargo = new Airplane("Southwest", 500.0, 6, 5000.0, 100, "Triangle");
        System.out.println(Cargo + "\n");
        System.out.println("Jets: ");
        Jet B2 = new Jet("USA", 250.0, 2, 3000.0, 100, "Square", "Nuclear", "Yes");
        System.out.println(B2 + "\n");
        System.out.println("-----SpaceShips------");
        System.out.println("NASA: ");
        SpaceShip Rocket = new SpaceShip("NASA", 900.0, 4, 10000.0, 6, "Round");
        System.out.println(Rocket + "\n");
        System.out.println("STAR WARS: ");
        MilenniumFalcon StarWars = new MilenniumFalcon("Millinuim falcon", 1000.0, 20, 20000.0, 6, "Square", "Yes", 8);
        System.out.println(StarWars + "\n");
        
    }
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
    @Override
      public double getSpeed(){
      return speed;
      }
    @Override
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
    @Override
      public String toString(){
      String result = "";
      result = "Brand: " + getBrand() + "\n" + "Speed (mph): " + getSpeed() + "\n" + "Passengers: " + getPassengers() + "\n" + "Cargo (lbs): " + getCargoWeight() + "\n";
      return result;
        }
      }
      //the Speedometer interface to show the speed of any vehicle in the same way
      interface Speedometer{
      public void setSpeed(double inSpeed);
      public double getSpeed();
      }
 
 

    class Car extends Vehicle{
    int wheels = 4;
    String color = "White";
    boolean spoiler = false;
    boolean stereo = false;
    double mpg = 0.0; //has an extra variable, mpg

    public Car(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, String inColor){
        super(inBrand, inSpeed, inPassengers, inCargo); //uses the super constructor
        mpg = inMPG; //also include the extra variable in the Car constructor
        color = inColor;
    }
    //another additional variable
    public void setSpoiler(boolean inSpoiler){
        spoiler = inSpoiler;
    }

    public boolean getSpoiler(){
        return spoiler;
    }
    public void setColor(String inColor){
        color = inColor;
    }

    public String getColor(){
        return color;
    }
    //another additional variable
    public void setStereo(boolean inStereo){
        stereo = inStereo;
    }

    public boolean getStereo(){
        return  stereo;
    }
    //overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (spoiler)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getMPG(){
        if(stereo)
            return mpg - (mpg / 10);
        else
            return mpg;
    }
    //usesd the super toString, as well as addingnthe new variable to it.
    public String toString(){
        String result = super.toString() +
                "MPG: " + this.getMPG() + "\n" + "Color: " + this.getColor();
        return  result ;
    }
    }
    


     class RaceCar extends Car{
     String frame = "";
     int tireSize = 0;
     
     public RaceCar(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, String inColor, String inFrame, int inTireSize){
     super(inBrand, inSpeed, inPassengers, inCargo, inMPG, inColor);
     frame = inFrame;
     tireSize = inTireSize; 
     
     }
     public String getFrame(){
        return frame;
    }
     
    public void setFrame(String inFrame){
        frame = inFrame;
    } 
    public int getTireSize(){
        return tireSize;
    }
   
    public void setTireSize(int inTireSize){
        tireSize = inTireSize;
    }
    public String toString(){
        String result = super.toString() +
                "\nHorsepower: " + this.getFrame() + "\n" + "Tire Size: " + this.getTireSize() + "in.";
        return  result ;
     }
     }

class FireEngine extends Car{
     int ladder = 0;
     String siren = "";
     
     public FireEngine(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, String inColor, int inLadder, String inSiren){
     super(inBrand, inSpeed, inPassengers, inCargo, inMPG, inColor);
     ladder = inLadder;
     siren = inSiren; 
     
     }
     public int getLadderLength(){
        return ladder;
    }
     
    public void setLadderLength(int inLadder){
        ladder = inLadder;
    } 
    public String getSiren(){
        return siren;
    }
   
    public void setSiren(String inSiren){
        siren = inSiren;
    }
    public String toString(){
        String result = super.toString() +
                "\nLadder length: " + this.getLadderLength() + "ft." + "\n" + "Siren: " + this.getSiren();
        return  result ;
     }
     }

    
    
     class Boat extends Vehicle{
     String rudder = "";
     String material = "";
     
     public Boat(String inBrand, double inSpeed, int inPassengers, double inCargo, String inMaterial, String inRudder){
     super(inBrand, inSpeed, inPassengers, inCargo);
     rudder = inRudder;
     material = inMaterial; 
     
     }
     public String getRudder(){
        return rudder;
    }
   
    public void setRudder(String inRudder){
        rudder = inRudder;
    } 
    public String getMaterial(){
        return material;
    }
   
    public void setMaterial(String inMaterial){
        material = inMaterial;
    }
    public String toString(){
        String result = super.toString() +
                "Rudder: " + this.getRudder() + "\n" + "Material: " + this.getMaterial();
        return  result ;
     }
     }

     class Submarine extends Boat{
     double oxygen = 0.0;
     String misslies = "";
     
     public Submarine(String inBrand, double inSpeed, int inPassengers, double inCargo, String inMaterial, String inRudder, double inOxygen, String inMissiles){
     super(inBrand, inSpeed, inPassengers, inCargo, inMaterial, inRudder);
     oxygen = inOxygen;
     misslies = inMissiles; 
     
     }
     public double getOxygen(){
        return oxygen;
    }
     
    public void setOxygen(double inOxygen){
        oxygen = inOxygen;
    } 
    public String getMissiles(){
        return misslies;
    }
   
    public void setMissiles(String inMissiles){
        misslies = inMissiles;
    }
    public String toString(){
        String result = super.toString() +
                "\nOxygen: " + this.getOxygen() + "\n" + "Missiles: " + this.getMissiles();
        return  result ;
     }
     }
      
      

     
     
     class Airplane extends Vehicle{
     String wing = "";
     int seats = 0;
     
     public Airplane(String inBrand, double inSpeed, int inPassengers, double inCargo, int inSeats, String inWing){
     super(inBrand, inSpeed, inPassengers, inCargo);
     wing = inWing;
     seats = inSeats;
     }
      public String getWing(){
        return wing;
    }
   
    public void setWing(String inWing){
        wing = inWing;
    } 
    public int getSeats(){
        return seats;
    }
   
    public void setSeats(int inSeats){
        seats = inSeats;
    }
    public String toString(){
        String result = super.toString() +
                "Wing: " + this.getWing() + "\n" + "Seats: " + this.getSeats();
        return  result ;
     }
     }

 class Jet extends Airplane{
     String bombs = "";
     String superSonic = "";
     
     public Jet(String inBrand, double inSpeed, int inPassengers, double inCargo, int inSeats, String inWing, String inBombs, String inSuperSonic){
     super(inBrand, inSpeed, inPassengers, inCargo, inSeats, inWing);
     bombs = inBombs;
     superSonic = inSuperSonic; 
     
     }
     public String getBombs(){
        return bombs;
    }
     
    public void setBombs(String inBombs){
        bombs = inBombs;
    } 
    public String getSuperSonic(){
        return superSonic;
    }
   
    public void setSuperSonic(String inSuperSonic){
        superSonic = inSuperSonic;
    }
    public String toString(){
        String result = super.toString() +
                "\nBombs: " + this.getBombs() + "\n" + "Super Sonic: " + this.getSuperSonic();
        return  result ;
     }
     }


     class SpaceShip extends Vehicle{
     int thrusters = 0;
     String window = "";
     
     public SpaceShip(String inBrand, double inSpeed, int inPassengers, double inCargo, int inThrusters, String inWindows){
     super(inBrand, inSpeed, inPassengers, inCargo);
     thrusters = inThrusters;
     window = inWindows;
     }
      public int getThrusters(){
        return thrusters;
    }
   
    public void setThrusters(int inThrusters){
        thrusters = inThrusters;
    } 
    public String getWindows(){
        return window;
    }
   
    public void setWindows(String inWindows){
        window = inWindows;
    }
    public String toString(){
        String result = super.toString() +
                "Thrusters: " + this.getThrusters() + "\n" + "Windows: " + this.getWindows();
        return  result ;
     }
     }
     class MilenniumFalcon extends SpaceShip{
     String lightSpeed = "";
     int lasers = 0;
     
     public MilenniumFalcon(String inBrand, double inSpeed, int inPassengers, double inCargo, int inThrusters, String inWindows, String inLightSpeed, int inLasers){
     super(inBrand, inSpeed, inPassengers, inCargo, inThrusters, inWindows);
     lightSpeed = inLightSpeed;
     lasers = inLasers; 
     
     }
     public String getLightSpeed(){
        return lightSpeed;
    }
     
    public void setLightSpeed(String inLightSpeed){
        lightSpeed = inLightSpeed;
    } 
    public int getLasers(){
        return lasers;
    }
   
    public void setLasers(int inLasers){
        lasers = inLasers;
    }
    public String toString(){
        String result = super.toString() +
                "\nLight Speed: " + this.getLightSpeed() + "\n" + "Lasers: " + this.getLasers();
        return  result ;
     }
     }