/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        Code c = new Code();        
       boolean y= c.isPalindrome(s);
       if(y == true)
       {
           System.out.println("palindrome");
       }
       else
       {
           System.out.println("not palindrome");
       }
    }
    
}
