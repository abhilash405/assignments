/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythogorian;

import java.util.Scanner;
/**
 *
 * @author Abhilash
 */
public class Pythogorian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               int ar[]=new int[3];
               Scanner sc= new Scanner(System.in);
               for(int i=0;i<3;i++)
               {
                   ar[i] =sc.nextInt();
               }
               
                    int x = ar[0]*ar[0], y = ar[1]*ar[1], z = ar[2]*ar[2];
  
                    if (x == y + z || y == x + z || z == x + y)
                       System.out.println("Yes");
                     else
                        System.out.println("No");        
    }
}
    