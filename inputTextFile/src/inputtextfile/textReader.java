/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputtextfile;
/**
 *
 * @author surya
 */
public class textReader {
    private int wordcount = 0;
    private int sentencecount = 0;
    private int vowelcount = 0;
    private int palindromecount = 0;

    public int countingNoWords(String str) {
        String[] str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            wordcount++;
        }
        return wordcount;
    }

    public int sentenceCount(String str) {
        String[] str1 = str.split("[!?.:]");
        for (int i = 0; i < str1.length; i++) {
            sentencecount++;
        }
        return sentencecount;
    }

    public int vowelCount(String str1) {
        String str = str1.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelcount++;
            }
        }
        return vowelcount;
    }

    public int palindromeCount(String str2) {
        
         String [] str = str2.split(" ");
         for(int i=0;i<str.length;i++)
         {
             StringBuilder input1 = new StringBuilder();
	        input1.append(str);
	        if(str.contentEquals(input1.reverse())){
	        	palindromecount++;
	        }
         }
        return palindromecount;
    }


}
