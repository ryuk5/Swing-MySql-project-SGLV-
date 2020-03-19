/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

/**
 *
 * @author Med Amine Ben Ammar
 */
public class Client {
    
    private int ncin;
    private String fname;
    private String lname;
    private int tel;
    private String adr;

    public Client() {
        super();
    }

    
    public Client(int ncin, String fname, String lname, int tel, String adr) {
        this.ncin = ncin;
        this.fname = fname;
        this.lname = lname;
        this.tel = tel;
        this.adr = adr;
    }

    public int getNcin() {
        return ncin;
    }

    public void setNcin(int ncin) {
        this.ncin = ncin;
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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

}
