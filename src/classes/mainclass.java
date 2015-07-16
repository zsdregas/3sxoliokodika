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
public class mainclass {
     public static void main(String[] args) {
         Hotel h1;
         Employee e1;
         Reservation rr1;
         
         h1 = new Hotel("Kisamos","Kriti","758694");
         e1 = new Employee("c1","John","John",30, 1000);
         rr1 = new Reservation("r1","16/07/2015","22/07/2015",1500);
         
         System.out.println(h1);
         System.out.println(e1);
         System.out.println(rr1);
         
     }
    
}
