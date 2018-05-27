/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowels;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class Vowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0,a=0,e=0,i=0,o=0,u=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String someString = sc.nextLine();
        someString=someString.toLowerCase();
        
//        for(int i=0;i <someString.length();i++){
//        if((someString.charAt(i) == 'a') || (someString.charAt(i) == 'e')  ||  (someString.charAt(i) == 'i') || (someString.charAt(i) == 'o') ||
//                (someString.charAt(i) == 'u')) {
//                System.out.println(" The String contains " + someString.charAt(i));
//    }

for(int j=0;j<someString.length();j++){
    char c=someString.charAt(j);
    switch(c){
        case 'a':
            a++;
            count++;
            break;
            case 'e':
            e++;
            count++;
            break;
            case 'i':
            i++;
            count++;
            break;
            case 'o':
            o++;
            count++;
            break;
            case 'u':
            u++;
            count++;
            break;
    }
}
        System.out.println("number of vowels"+count);
        System.out.println("number of a "+a);
        System.out.println("number of e "+e);
        System.out.println("number of i "+i);
        System.out.println("number of o "+o);
        System.out.println("number of u "+u);
        }
    
    }
