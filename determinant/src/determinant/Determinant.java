/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinant;
import java.util.Scanner;
/**
 *
 * @author Abhilash
 */

public class Determinant {




public static void  main(String [] args)
{
     float[][] arr = new float[3][3];
     Scanner s = new Scanner(System.in);
    for (int i = 0; i < 2; i++)
 
            for (int j = 0; j < 2; j++)
                 arr[i][j] =s.nextFloat();
   
    
    for (int i = 0; i < 2; i++)
 
            for (int j = 0; j < 2; j++)
                System.out.println(arr[i][j]);
    
        //float[][] arr = {{6, 1, 1}, {4, -2, 5}, {2, 8, 7}};
//     float determinant = arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0];
        float determinant = arr[0][0] * (arr[1][1] * arr[2][2] - arr[1][2] * arr[2][1]) -
                            arr[0][1] * (arr[1][0] * arr[2][2] - arr[1][2] * arr[2][0]) +
                            arr[0][2] * (arr[1][0] * arr[2][1] - arr[1][1] * arr[2][0]);

        System.out.println(determinant);
    }
}

