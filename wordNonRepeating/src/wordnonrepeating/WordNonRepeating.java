/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordnonrepeating;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class WordNonRepeating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner( System.in );
    System.out.println("Enter a sentence : ");
    String s1 = input.nextLine();
  String x ="";
        String[] words=s1.split(" ");
        for(int i=0;i<words.length;i++)
        { if(words[i]!=null)
            {
                for(int j =i+1;j<words.length;j++)
                {
                    if(words[i].equals(words[j]))
                    {
                        words[j]="";
                        words[i]="";
                    }
                }
            }
        }
          for(int k=0;k<words.length;k++)
        {
            if(words[k]!=null)
            {
                x=x+" "+words[k];
                
            }
    }
          
          String y = x.trim();
          String[] out = y.split(" ");
          System.out.println(out[0]);
    
}
}