/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphasort;

import java.util.Arrays;

/**
 *
 * @author Abhilash
 */
public class logic {
   public static String sortString(String inputString)
    {
        
        char tempArray[] = inputString.toCharArray();
         
        Arrays.sort(tempArray);
         
     
        return new String(tempArray);
}
}
