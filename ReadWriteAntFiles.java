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
            
            import java.util.Scanner;



            public class ReadWriteAntFiles {
                
            public static void main(String[] args) {
                
            System.out.print("Enter your Name: ");    
            Scanner n = new Scanner(System.in);
            String name =  n.nextLine();
            
            System.out.print("Enter your Email: ");    
            Scanner em = new Scanner(System.in);
            String email =  em.nextLine();
            
            System.out.print("Enter your Graduation Year: ");    
            Scanner g = new Scanner(System.in);
            String gradYear =  g.nextLine();
            
            System.out.print("Enter your Username: ");    
            Scanner u = new Scanner(System.in);
            String username =  u.nextLine();
            
            
            
            String filePath = "Contacts/contacts.txt";
            String outPath = "Contacts/contacts.txt";
            
            
            
            
            String contentToWrite =  name + ","  + email + "," + gradYear + "," + username;
            
            // Write to file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            //writer.write(contentToWrite);
            writer.append(contentToWrite + "\n");
            System.out.println("Successfully wrote to the file.");
            } 
            catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            }
            // Read from file
            try (BufferedReader reader = new BufferedReader(new FileReader(outPath))) {
            String line;
            System.out.println("\nReading from the file:");
            while ((line = reader.readLine()) != null) {
            System.out.println(line);
            }
            } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: " + e.getMessage());
            }
        }
      }