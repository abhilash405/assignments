/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Abhilash
 */
public class Cubiod  extends shape{
    double l;
    double h;
    double w;

    public Cubiod(double l, double h, double w) {
        if(h<=0 || l<=0 || w<=0 ){
            throw new IllegalArgumentException("values cannot be less than zero");
        }
        this.l = l;
        this.h = h;
        this.w = w;
    }
    
    @Override
    public double getArea() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       double area= 2*(l*w+l*h+h*w);
       return area;
    }

    @Override
    public double getVolume() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       double volume = l*w*h;
       return volume;
    }
    
}
