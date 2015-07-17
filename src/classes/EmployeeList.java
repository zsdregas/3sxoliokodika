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
import java.util.LinkedList;

/**
 *
 * @author DSE
 */
public class EmployeeList extends LinkedList{
    public void save() throws FileNotFoundException, IOException{
        FileOutputStream file2 = new FileOutputStream("employee.txt", true);
        OutputStreamWriter output= new OutputStreamWriter(file2);
        BufferedWriter bw1 = new BufferedWriter(output);
        
        for (int i = 0; i < this.size(); i++) {
            bw1.write(this.get(i).uid + ";" + this.fname + ";"+ this.lname + ";"+ this.age+";"+ this.salary+"\n");
        }
        
        bw1.close();
    
    }
    
}
