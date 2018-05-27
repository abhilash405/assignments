/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          {
        Scanner sc=new Scanner(System.in);
        StringBuilder input1 = new StringBuilder();
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        
        int z=sc.nextInt();
        char tempArray[] = s.toCharArray();       
        Arrays.sort(tempArray);    
        String tempString = "";
        for(int i=0;i<tempArray.length;i++)
        {
        input1.append(tempArray[i]+"");
        }
              System.out.println("String buffer value "+input1);
           
              System.out.println(+z+"rd smallest value is:"+input1.charAt(z-1));
              input1.reverse();
              System.out.println(+z+"rd largest value is:"+input1.charAt(z-1));
              System.out.println("The reversed strimg is"+input1);                         
    }
    }
    
}
