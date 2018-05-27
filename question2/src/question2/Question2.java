/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
		GCD obj1= new GCD();
		System.out.println("Please enter the first number");
		int a=sc.nextInt();
		System.out.println("Please enter the second number");
		int b=sc.nextInt();
		System.out.println("GCD of the two numbers are :" + GCD.do_gcd(a, b));
		System.out.println("LCM of the two numbers are :" + GCD.do_lcm(a, b));
                

    }
    
}
