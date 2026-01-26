/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methoddesign;

/**
 *
 * @author mnovotny2027
 */
public class MethodDesign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student("James ", "Smith");
       Student st2 = new Student("Ava ", "Jones");

       System.out.println(st1);
       System.out.println(st2);
       
       //3 courses
    }
    
}
class Student{

        private String firstName, lastName;
        
        Course c1 = new Course();
        int s1 = c1.setScore(85);
        
        Course c2 = new Course();
        int s2 = c2.setScore(90);
        
        Course c3 = new Course();
        int s3 = c3.setScore(95);
        
    public Student(){
        
            firstName = "";
            lastName = "";
}
    public Student(String first, String last){
        firstName = first;
        lastName = last;
}
    public int getAverage(){
        int average = (s1 + s2 + s3)/3;
        return average;
    }
//Course constructer

     public String toString(){
       String result; 
       result = firstName + "" + lastName + "\nScore: Test #1: " + s1 + "\nScore: Test #2: " + s2 + "\nScore: Test #3: " + s3 
               + "\nClass Average: " + getAverage();
       return result; 
       }
    }
    

     class Course{
        public int score = 0;
        
        public int setScore(int inScore){
             score = inScore;
             return score;
    }
        public int getScore(){
             return score;
       }
       
    }


