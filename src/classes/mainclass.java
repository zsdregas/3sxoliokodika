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
         Reservation rr1;
         
         h1 = new Hotel("Kisamos","Kriti","758694");
         e1 = new Employee("c1","John","John",30, 1000);
         rr1 = new Reservation("r1","16/07/2015","22/07/2015",1500);
         
         System.out.println(h1);
         
         h1.save();
         e1.save();
         rr1.save();
         System.out.println(e1);
         System.out.println(rr1);
        
     SimpleDateFormat dt1  = new SimpleDateFormat("dd/mm/yyyy");
     //Date d1, d2;
     Date d1 = dt1.parse(rr1.getDateStart());
     Date d2 = dt1.parse(rr1.getDateEnd());
     
     System.out.println(d2.after(d1));
    }
}
