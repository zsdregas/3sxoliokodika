/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author DSE
 */
public class Hotel {
    
    private String name, address, telephone;
    private int stars;
    
    private ArrayList <Employee> employees;
    private ArrayList <Reservation> reservations;

    public Hotel(String name, String address, String telephone,int stars) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.stars = stars;
        
        employees = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Hotel{" + "name=" + name + ", address=" + address + ", telephone=" + telephone + ", stars=" + stars + '}';
    }
 
    public void save() throws FileNotFoundException, IOException{
        FileOutputStream file2 = new FileOutputStream("hotel.txt", true);
        OutputStreamWriter output= new OutputStreamWriter(file2);
        BufferedWriter bw1 = new BufferedWriter(output);
        
        bw1.write(this.name + ";" + this.address + ";"+ this.telephone + ";"+ this.stars+"\n");
        bw1.close();
        
        
        //Save Employess
        FileOutputStream EmplFile = new FileOutputStream("employee.txt", true);
        OutputStreamWriter output1= new OutputStreamWriter(EmplFile);
        BufferedWriter bw = new BufferedWriter(output1);
        for (Employee employee : this.employees) {
            employee.save(bw);
        }
        bw.close();
        
        //Save Reservations
        FileOutputStream resFile = new FileOutputStream("reservation.txt", true);
        OutputStreamWriter output2= new OutputStreamWriter(resFile);
        bw = new BufferedWriter(output2);
        
        for (int i=0; i<this.reservations.size();i++){
             this.reservations.get(i).save(bw);
         }
        bw.close();
    }
    
    public boolean addEmployee(Employee empl){
       
        int size;
        size = employees.size();
        for (int i=0; i<size;i++){
            
            if(employees.get(i).uid.equals(empl.uid)){
                System.out.println("Ο υπάλληλος υπάρχει ήδη΄!!");
                return false;
            }
        }
        
        employees.add(empl);
        
        
        return true;
        
    }
    
    public boolean addReservation(Reservation res) throws RuntimeException{
        int size = this.reservations.size();
        for (int i=0; i<size;i++){
           
                if(this.reservations.get(i).uid.equals(res.uid)){
                   // System.out.println("Η κράτηση υπάρχει ήδη");
                   throw new RuntimeException("Η κράτηση υπάρχει ήδη");
                  // return false;

                }
                     //   catch(RuntimeException e){
                System.out.print("Error"+e.getMessage());
            }
        
        
        this.reservations.add(res);
        return true;
    }
    
    
}
