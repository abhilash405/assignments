/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Abhilash
 */
public class GCD {
    int a,b;
	public int getA() {
	return a;
	}
	public void setA(int a) {
	this.a = a;
	}
	public int getB() {
	return b;
	}
	public void setB(int b) {
	this.b = b;
	}
	public static int do_gcd(int num1,int num2) {
		
		if(num2==0)
                    return num1;		
		return do_gcd(num2,num1%num2);
	}	
	public static int do_lcm(int num1,int num2) {
	return (num1*num2)/do_gcd(num1, num2);
	}
}
