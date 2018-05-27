/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tooctal;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class ToOctal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner( System.in );
    System.out.print("Enter a decimal number : ");
    int num =input.nextInt();
    int temp, counter = 0;
    int[] oct = new int[10];
    temp = num;
    while(temp!=0) 
    {
	oct[counter] = temp%8;
	temp = temp/8;
	counter++;
    }
    for(int j=counter-1;j>=0;j--) 
    {
	System.out.print(oct[j]);
    }
}
   
}
