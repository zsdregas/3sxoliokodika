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
public class Employee {
    String uid, fname, lname;
    int age;
    double salary;

    public Employee(String uid, String fname, String lname, int age, double salary) {
        this.uid = uid;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.salary = salary;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", salary=" + salary + '}';
    }
    
    public void save() throws FileNotFoundException, IOException{
        FileOutputStream file2 = new FileOutputStream("employee.txt", true);
        OutputStreamWriter output= new OutputStreamWriter(file2);
        BufferedWriter bw1 = new BufferedWriter(output);
        
        bw1.write(this.uid + ";" + this.fname + ";"+ this.lname + ";"+ this.age+";"+ this.salary+"\n");
        bw1.close();
    
    }
     
    public void save(BufferedWriter bw) throws FileNotFoundException, IOException{  
        bw.write(this.uid + ";" + this.fname + ";"+ this.lname + ";"+ this.age+";"+ this.salary+"\n");
    }
}
