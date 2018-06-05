/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputtextfile;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author surya
 */
public class InputTextFile {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) throws Exception {
        // TODO code application logic here
        File file = new File("D:\\input.txt");
        Scanner Sc = new Scanner(file);
        Scanner Sc1 = new Scanner(file);
        Scanner Sc2 = new Scanner(file);
        Scanner Sc3 = new Scanner(file);
        textReader t = new textReader();
        while (Sc.hasNext()) {
            System.out.println("number of words:"+t.countingNoWords(Sc.nextLine()));
        }
        while (Sc1.hasNext()) {
            System.out.println("number of sentences:"+t.sentenceCount(Sc1.nextLine()));
        }
        while (Sc2.hasNext()) {
            System.out.println("number of vowels:"+t.vowelCount(Sc2.nextLine()));
        }
        System.out.println("size of the file:"+file.length());
        while (Sc3.hasNext()) {
            String store=Sc3.nextLine();
            System.out.println(store);
            System.out.println(t.palindromeCount(store));
        }

    }

}

   