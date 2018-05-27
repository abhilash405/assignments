/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author kavya
 */
public class cylinder extends shape{
 double r;
 double h;
    public cylinder(double r, double h) {
        if(r<=0 || h<=0){
            throw new IllegalArgumentException("values cannot be less than zero");
        }
        else{
        this.r=r;
        this.h=h;
        }
    }
    

    @Override
    public double getArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       double area = (2*Math.PI*r*h)+(2*Math.PI*r*r);
       return area;
    }

    @Override
    public double getVolume() {
       //
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       double vol = Math.PI*r*r*h;
       return vol;
    
    }
    
}
