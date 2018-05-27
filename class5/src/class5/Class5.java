/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;
 import java.util.Scanner;
/**
 *
 * @author Abhilash
 */
public class Class5 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
        int n, count = 0, a;
        String x = "";
        String reverse="";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            x = x + "" + a;
            n = n / 2;
        }
        for(int i=x.length()-1;i>=0;i--)
        {
            reverse=reverse+x.charAt(i);
        }
        System.out.println("Binary number:"+reverse);
        int z = Integer.parseInt(reverse);	
        int y = getDecimalFromBinary(z);
        System.out.println(y);
      }

   
public static int getDecimalFromBinary(int binary){
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                decimal += tmp*Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
    }
   
}