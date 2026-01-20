/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todo.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mnovotny2027
 */
public class ToDoProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a list of tasks with different Priorities and Complexities
        List<Task> todoList = new ArrayList<>();
        todoList.add(new Task(10, " Clean Yard ", 2));
        todoList.add(new Task(2, " Dishes ", 7));
        todoList.add(new Task(10, " Laundry ", 5));
        todoList.add(new Task(9, " Homework ", 5));
        System.out.println("Before Sorting: " + todoList);
        Collections.sort(todoList);
        System.out.println("After Sorting: " + todoList);
    }
}

class Task implements Comparable<Task> {
    private int priority;
    private String name;
    private int complexity;
     
    public Task(int priority, String name, int complexity) {
      this.priority = priority;
      this.complexity = complexity;
      this.name = name;
    }
    public int getPriority(){
        return priority;
    }
    public String getName(){
        return name;
    }
    public int getComplexity(){
        return complexity;
    }

@Override
public int compareTo(Task otherTask){
    
    if (otherTask.getPriority() != (this.priority)){
        return Integer.compare(otherTask.getPriority(), this.priority);
    }else{
        return Integer.compare(otherTask.getComplexity(), this.complexity);
    }
    
}
    public String toString() {
    return " (" + priority + name + complexity + ")";
}

}
