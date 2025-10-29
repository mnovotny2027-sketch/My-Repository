/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorsassignment;

/**
 *
 * @author mnovotny2027
 */
//Creates a public Driver class
public class ConstructorsAssignment {
    //Fills in all course information
    public static void main(String[] args){
        Course myCourse1 = new Course("AP Computer Science A", "AP CS A", "100", "Mr. Nelson");
        Course myCourse2 = new Course("AP PreCalculus", "AP Pre-Calc", "300", "Mr. Dahms");
        Course myCourse3 = new Course("AP Biology", "AP Bio", "400", "Mrs. Lopatka");
        Course myCourse4 = new Course("AP US History");
        
        
        //Creates a costomizable course
        myCourse4.setCourseCode("APUSH");
        myCourse4.setPointsTotal("500");
        myCourse4.setInstructorName("Mr. Murphy");
        //Outprints the courses
        System.out.println(myCourse1);
        System.out.println(myCourse2);
        System.out.println(myCourse3);
        System.out.println(myCourse4);
        
    }
    
}

//Creates a class called Course
class Course {
    //Initalizes blank private String variables  
    private String courseTitle = "";
      private String courseCode = "";
      private String pointsTotal = "";
      private String instructorName = "";
      
    //Constructs the variables
      public Course(String inT, String inCC, String inPT, String inIN){
          courseTitle = inT;
          courseCode = inCC;
          pointsTotal = inPT;
          instructorName = inIN;
   
    //Constructs the Course String specfically for later modification  
       }
      public Course(String inT){
          courseTitle = inT;
       }
      //Gets and sets each variable
       public String getCourseCode(){
          return courseCode;
       }
       public void setCourseCode(String inCC){
           courseCode = inCC;
       }
       
       
       public String getInstructorName(){
          return instructorName;
       }
       public void setInstructorName(String inIN){
           instructorName = inIN;
       }
       
       
       public String getCourseTitle(){
          return courseTitle;
       }
       public void setCourseTitle(String inT){
           courseTitle = inT;
       }
       
       
       public String getPointsTotal(){
          return pointsTotal;
       }
       public void setPointsTotal(String inPT){
           pointsTotal = inPT;
       }
       //Outputs the variables to a String
       public String toString(){
           return courseTitle + ", " + courseCode + ", " + pointsTotal + ", " + instructorName;
        }           
    }
     

  