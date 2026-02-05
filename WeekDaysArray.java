/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weekdaysarray;
import java.util.Arrays;
import java.util.Random; 

/**
 *
 * @author mnovotny2027
 */
public class WeekDaysArray {

    /**
     * @param args the command line arguments
     */
    static String[] weekDays = {"\nMonday", "\nTuesday", "\nWednesday", "\nThursday", "\nFriday", "\nSaturday", "\nSunday"};
    public static void main(String[] args) {
        
        
        System.out.println(Arrays.toString(weekDays));
        
        WorkDayList d = new WorkDayList();
        System.out.println(d.getWorkDays(weekDays));
        
        Random rand = new Random();
        for (int i = 0; i < weekDays.length; i++){
            int randomIndexToSwap = rand.nextInt(weekDays.length);
            String temp = weekDays[randomIndexToSwap];
            weekDays[randomIndexToSwap] = weekDays[i];
            weekDays[i] = temp;
        }
        System.out.println(Arrays.toString(weekDays));
    }
}
class WorkDayList{
        int count = 0;
        //String[] weekDays = new String [5];
        String[] temp;
        
        public String getWorkDays(String[] w){
            count = 5;
            temp = new String[count];
            for (int i = 0; i < 5; i++){
                temp[i] = w[i];
            }
            w = temp;
            return Arrays.toString(w);
        }
       
}
    
    

