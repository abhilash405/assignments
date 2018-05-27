/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package words;
import java.lang.String;
/**
 *
 * @author Abhilash
 */
public class code {
    public static int countWords(String input) 
    
    { if (input == null || input.isEmpty()) 
    { 
        return 0; 
    } 
    String[] words = input.split("(?=[,.])|\\s+");
    
    return words.length; 
    }


}
