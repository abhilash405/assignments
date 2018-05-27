/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.lang.Math;
/**
 *
 * @author Abhilash
 */
public class sphere  extends shape{

    double r;
    public sphere(double r){
        super();
        if(r<=0){
            throw new IllegalArgumentException("radius cannot be less than zero");
        }
    
    this.r=r;
    }
    public double getArea() {
        double area= 4*(Math.PI*(r*r));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return area;
    }

    @Override
    public double getVolume() {
        double volume= 4/3*(Math.PI*(r*r*r));
        return volume;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
