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
public class cube extends shape {

    double x;
    public cube(double x) {
        super();
        if(x<=0){
            
            throw new IllegalArgumentException("values cannot be less than zero");
            
        }
        else{
        
        
        }
        this.x = x;
    }

    @Override
    public double getArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double area = 6*x*x; 
        return area;
    }
    

    @Override
    public double getVolume() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double vol = Math.pow(x, 3);
        return vol;
    }
     
}
