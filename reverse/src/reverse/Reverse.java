/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class Reverse {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String ar[]=s.split(" ");
        //String y="";
        for(int i=0;i<ar.length;i++)
        {
         for(int j=ar[i].length()-1;j>=0;j--)
         {
             System.out.print(ar[i].charAt(j));
         }
        
        System.out.print(" ");
    }
    
    }
}
