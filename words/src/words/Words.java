/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package words;

import java.util.Scanner;
import static words.code.countWords;

/**
 *
 * @author Abhilash
 */
public class Words {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                
                int y=countWords(s);
                System.out.println(y);
    }
    
}
