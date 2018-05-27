/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Abhilash
 */
public class Code {
   public boolean isPalindrome(String s) {
    int n = s.length();
    s = s.toLowerCase();
    boolean x = false;
    for (int i = 0; i < (n / 2) + 1; ++i) {
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            x = false;
        }
        else
            x= true;
    }
    return x;
    
   }
}
