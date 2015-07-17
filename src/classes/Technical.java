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
public class Technical extends Employee{

  String specialty;

    public Technical(String specialty, String uid, String fname, String lname, int age, double salary) {
        super(uid, fname, lname, age, salary);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void save() throws FileNotFoundException, IOException {
        //super.save(); //To change body of generated methods, choose Tools | Templates.
        
        FileOutputStream file2 = new FileOutputStream("employee.txt", true);
        OutputStreamWriter output= new OutputStreamWriter(file2);
        BufferedWriter bw1 = new BufferedWriter(output);
        
        bw1.write(this.uid + ";" + this.fname + ";"+ this.lname + ";"+ this.age+";"+ this.salary+";"+this.specialty+"\n");
        bw1.close();
    
    }
    

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "Employee{" + "uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", salary=" + salary +", technical=" + specialty +  '}';
    }
  
    
}

