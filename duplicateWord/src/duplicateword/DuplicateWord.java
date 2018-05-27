/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateword;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class DuplicateWord {
      public static void main(String[] args) 
    {
         Scanner input = new Scanner( System.in );
    System.out.println("Enter a sentence : ");
    String s1 = input.nextLine();
      
        String[] words=s1.split(" ");
        for(int i=0;i<words.length;i++)
        { if(words[i]!=null)
            {
                for(int j =i+1;j<words.length;j++)
                {
                    if(words[i].equals(words[j]))
                    {
                        words[j]=null;
                    }
                }
            }
        
        }
     
        for(int k=0;k<words.length;k++)
        {
            if(words[k]!=null)
            {
                System.out.print(words[k]+" ");
            }
        }
    }
}
    
