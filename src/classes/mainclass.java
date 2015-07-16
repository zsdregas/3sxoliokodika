/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DSE
 */
public class mainclass {
    
    
    
     public static void main(String[] args) throws ParseException, IOException {
         Hotel h1;
         Employee e1;
         Reservation r1, r2;
         
         h1 = new Hotel("Kisamos","Kriti","758694");
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
    }
}
