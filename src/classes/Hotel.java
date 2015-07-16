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

/**
 *
 * @author DSE
 */
public class Hotel {
    
    private String name, address, telephone;
    private int stars;

    public Hotel(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
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
        
        String s1 = this.name + "," + this.address + ","+ this.stars + ","+ this.telephone+"\n";
        bw1.write(s1);
        bw1.close();
    
    }
    
}
