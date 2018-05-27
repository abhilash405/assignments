/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class Replace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        String s =sc.nextLine();
        
        String[] replaceStr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<=9;i++)
        {
            s=s.replaceAll(s.charAt(i)+"",replaceStr[i]);
        }
        System.out.println(s);
        //char c[]= s.toCharArray();
//        for(int i=0;i<s.length();i++)
//        {
//        switch(s.charAt(i))
//        {
//            case '1':
//                s = s.replace("1"," one ");
//                break;
//               // continue;
//            case '2':
//                 s = s.replace("2"," two ");
//                 break;
//               //  continue;
//            case '3':
//        s=s.replace("3"," three ");
//        continue;
//            case '4':
//                 s=s.replace("4"," four ");
//                 continue;
//            case '5':
//        s=s.replace("5"," five ");
//        continue;
//            case '6':
//        s=s.replace("6"," six ");
//        continue;
//            case '7':
//        s=s.replace("7"," seven ");
//        continue;
//            case '8':
//        s=s.replace("8"," eight ");
//        continue;
//            case '9':
//        s=s.replace("9"," nine ");
//        continue;
//            case '0':
//        s=s.replace("0"," zero ");      
//         }
//        }
//    
//    System.out.println(s);
    }
}
