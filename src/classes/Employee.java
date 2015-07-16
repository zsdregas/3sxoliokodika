/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

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
    
    
    
}
