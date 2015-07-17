/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author DSE
 */
public class mainclass {
    
    public static void printhotels(Hotel[] hotels) throws IOException{
        FileInputStream fis = new FileInputStream("hotel.txt");
        InputStreamReader input = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(input);

        String data;
        int i=0;
        while((data = br.readLine())!=null){
            String[] result = data.split(";");
            hotels[i] = new Hotel(result[0],result[1],result[2], Integer.parseInt(result[3]));
            i++;
        }
        br.close();

        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }

    }
    
     public static void printEmployees(Employee[] employees1) throws IOException{
        FileInputStream fish = new FileInputStream("employee.txt");
        InputStreamReader input1 = new InputStreamReader(fish);
        BufferedReader br1 = new BufferedReader(input1);

        String data1;
        int i1=0;
        while((data1 = br1.readLine())!=null){
           
            String[] result1 = data1.split(";");
            employees1[i1] = new Employee(result1[0],result1[1],result1[2], Integer.parseInt(result1[3]),Double.parseDouble(result1[4]));
            i1++;
        }
        br1.close();

        for (Employee employee1 : employees1) {
            System.out.println(employee1);
        }

    }
    

     public static void main(String[] args) throws ParseException, IOException {
         Hotel h1;
         Employee e1;
         Reservation r1, r2;
         
         h1 = new Hotel("Kisamos","Kriti","758694",5);
         e1 = new Employee("c1","John","John",30, 1000);
         r1 = new Reservation("r1","16/07/2015","22/07/2015",1500);
         r2 = new Reservation("r2","18/10/2015","22/07/2015",1500);
         
         System.out.println(h1);
         
         h1.save();
         e1.save();
         r1.save();
         r2.save();
         
         
         System.out.println(e1);
         System.out.println(r1);
        
     SimpleDateFormat dt1  = new SimpleDateFormat("dd/mm/yyyy");
     //Date d1, d2;
     Date d1 = dt1.parse(r1.getDateStart());
     Date d2 = dt1.parse(r1.getDateEnd());
     
     System.out.println(d2.after(d1));
      
     
     BufferedReader reader = new BufferedReader(new FileReader("hotel.txt"));
     int lines = 0;
     while (reader.readLine() != null) lines++;
           reader.close();
     
     Hotel [] hotels;
     
     hotels = new Hotel[lines];
     
     printhotels(hotels);
     
     BufferedReader reader1 = new BufferedReader(new FileReader("employee.txt"));
     int lines1 = 0;
     while (reader1.readLine() != null) lines1++;
           reader1.close();
     
//     hotels = new Hotel[lines]; 
    Employee [] employees2;
    employees2 = new Employee[lines1];
    printEmployees(employees2);
    
    
    Reservation[] reservations;
    
    Technical tech1;
    tech1 = new Technical("Ηλεκτρολόγος", "200", "Γιάννης", "Ιακώβου", 20, 1000.0);
    
    System.out.println(tech1.toString());
    
    tech1.save();
    
    
     
     }
}
