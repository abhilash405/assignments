/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class mainClass {
    public static void main(String[] args)
   {
       boolean x=false;
        do{
             x=false;
        System.out.println("select the shape");
        Scanner sc = new Scanner(System.in);
        String shapes= sc.next();
        switch(shapes){
            case "sphere": 
        System.out.println("enter radius");
        double rad= sc.nextDouble();
        try{
        shape sh = new sphere(rad);
        System.out.println("Surface Area: "+sh.getArea());
        System.out.println("Volume: "+sh.getVolume());
        } catch(IllegalArgumentException e ){
                System.out.println("values cannot be less than zero");
                x=true;
                }
        break;
            case "cube":
        System.out.println("enter side length");
        double len= sc.nextDouble();
        try{
        cube cu = new cube(len);
        System.out.println("Surface Area: "+cu.getArea());
        System.out.println("Volume: "+cu.getVolume());
        }
         catch(IllegalArgumentException e ){
         
                System.out.println("values cannot be less than zero");
                x=true;
                }
        break;        
            case "cubiod":
        System.out.println("enter side length");
        
        double length= sc.nextDouble();
        System.out.println("enter side width");
        double wid= sc.nextDouble();
        System.out.println("enter side height");
        double hei= sc.nextDouble();
        try{
        Cubiod cub = new Cubiod(length,hei,wid);
        System.out.println("Surface Area: "+cub.getArea());
        System.out.println("Volume: "+cub.getVolume());
        }
         catch(IllegalArgumentException e ){
                 System.out.println("values cannot be less than zero");
                x=true;
                }
        break;
        
        case "cylinder":
        System.out.println("enter side radius");
        double length1= sc.nextDouble();
        System.out.println("enter side height");
        double width= sc.nextDouble();
     try{
       cylinder c = new cylinder(length1,width);
        System.out.println("area of cylinder "+c.getArea());
            System.out.println("volume of cylinder"+ c.getVolume());}
             catch(IllegalArgumentException e ){
                 System.out.println("values cannot be less than zero");
                x=true;
                }
        default:
            System.out.println("shape not recognized");
        }
       
}
while(x);
    }

}