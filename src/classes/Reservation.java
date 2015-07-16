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
public class Reservation {
    String uid, dateStart, dateEnd;
    double cost;

    public Reservation(String uid, String dateStart, String dateEnd, double cost) {
        this.uid = uid;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.cost = cost;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Reservation{" + "uid=" + uid + ", dateStart=" + dateStart + ", dateEnd=" + dateEnd + ", cost=" + cost + '}';
    }
    
    
    
}
