/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent;

/**
 *
 * @author Med Amine Ben Ammar
 */
public class Rent {
    
    private int ncin;
    private int id;
    private String date;
    private int nbd;
    private int pd;

    public Rent() {
        super();
    }

    
    public Rent(int ncin, int id, String date, int nbd, int pd) {
        this.ncin = ncin;
        this.id = id;
        this.date = date;
        this.nbd = nbd;
        this.pd = pd;
    }

    public int getNcin() {
        return ncin;
    }

    public void setNcin(int ncin) {
        this.ncin = ncin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNbd() {
        return nbd;
    }

    public void setNbd(int nbd) {
        this.nbd = nbd;
    }

    public int getPd() {
        return pd;
    }

    public void setPd(int pd) {
        this.pd = pd;
    }
     
    
    
    
    
}
