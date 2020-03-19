/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author Med Amine Ben Ammar
 */
public class Car {
    private int id;
    private String mar;

    public Car() {
        super();
    }

    public Car(int id, String mar) {
        this.id = id;
        this.mar = mar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }
    
    
    
 }
