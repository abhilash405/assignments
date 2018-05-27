/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphasort;
   
import static alphasort.logic.sortString;
import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class AlphaSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String someString = sc.nextLine();
        String outputString = sortString(someString);
         
        System.out.println("Input String : " + someString);
        System.out.println("Output String : " + outputString);
    }
}

    }
    
