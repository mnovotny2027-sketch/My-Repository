/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readwriteantfiles;
           
            import java.io.BufferedReader;

            import java.io.BufferedWriter;
            import java.io.FileReader;
            import java.io.FileWriter;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Collections; 
            import java.util.Comparator;
            
            import java.util.Scanner;



     public class ReadWriteAntFiles {
                
            public static void main(String[] args) {
               // Ask user to enter/sort
              ArrayList<Contact> contacts = new ArrayList<>();
           
            Scanner input = new Scanner(System.in);
            String filePath = "Contacts/contacts.txt";
     
            
        
         try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\t");

                if (parts.length >= 4) {
                    contacts.add(new Contact(
                            parts[0],
                            parts[1],
                            parts[2],
                            parts[3]
                    ));
                }
            }
         
         System.out.println("Contacts loaded!");
         
            } catch (IOException e){
         System.out.println("No existing file found. Starting fresh.");
     }
            
            while (true){
                
            System.out.println("\nChoose an option:");
            System.out.println("'a' = add contact");
            System.out.println("'e' = sort by email");
            System.out.println("'y' = sort by grad year");
            System.out.println("'n' = sort by name");
            System.out.println("'p' = print contacts");
            System.out.println("'q' = quit");
            
            String choice = input.nextLine();
            
      
             if (choice.equals("a")){
            System.out.print("Enter your Name: ");    
           
            String name =  input.nextLine();
            
            System.out.print("Enter your Email: ");    
           
            String email =  input.nextLine();
            
            System.out.print("Enter your Graduation Year: ");    
     
            String gradYear =  input.nextLine();
            
            System.out.print("Enter your Username: ");    
         
            String username =  input.nextLine();
            
            contacts.add(new Contact(name, email, gradYear, username)); 
            
            
            
          } 
            else if (choice.equals("e")) {

                Collections.sort(contacts, Comparator.comparing(Contact::getEmail));
                System.out.println("\nSorted by email:");
                printContacts(contacts);

            } 
            else if (choice.equals("y")) {

                Collections.sort(contacts,
                        Comparator.comparingInt(c -> Integer.parseInt(c.getGradYear())));
                System.out.println("\nSorted by graduation year:");
                printContacts(contacts);

            } 
            else if (choice.equals("n")) {

                Collections.sort(contacts, Comparator.comparing(Contact::getName));
                System.out.println("\nSorted by name:");
                printContacts(contacts);

            } 
            else if (choice.equals("p")) {

                System.out.println("\nContact List:");
                printContacts(contacts);

            

            } else if (choice.equals("q")) {
                break;
            }
        }
             
             
    
          try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                for (Contact c : contacts) {
                    writer.write(c.toString());
                    writer.newLine();
                }
                System.out.println("Contacts saved to file!");
                
            } catch (IOException e) {
                e.printStackTrace();
            }

            input.close();
            
     }
             public static void printContacts(ArrayList<Contact> contacts) {
        System.out.println("----------------------------");
        for (Contact c : contacts) {
            System.out.println(c);
        }
        System.out.println("----------------------------");
             }
}
            
       
 class Contact 
{
private String name, email, gradYear, username;


public Contact(String inName, String inEmail, String ingradYear, String inUsername)
{
this.name = inName;
this.email = inEmail;
this.gradYear = ingradYear;
this.username = inUsername;
}

public String toString()
{
return name + "\t" + email + "\t" + gradYear +  "\t" + username;
}



public String getName()
{
return name;
}

public String getEmail()
{
return email;
}

public String getGradYear()
{
return gradYear;
}

public String getUsername()
{
return username;
}
 }
     





            
     
   