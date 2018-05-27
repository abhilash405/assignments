/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occurrence;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class Occurrence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String someString = sc.nextLine();
        System.out.println("Enter a character:");
        char someChar = sc.next().charAt(0);
int count = 0;
  
for (int i = 0; i < someString.length(); i++) {
   if (someString.charAt(i)== someChar) {
        
        count++;
    }
}
        System.out.print("occurence of the element is :");
        System.out.println(count);
        
    }
    
}
