/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrepeating;

import java.util.Scanner;
/**
 *
 * @author Abhilash
 */
public class NonRepeating {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String input=sc.nextLine();
		String input1=input.replaceAll("[ ,.!?0-9]", " ");
		NonRepeating nn=new NonRepeating();

		nn.check(input1);

	}
	public void check(String input1) {

		StringBuilder s1 = new StringBuilder(input1);
		StringBuilder s2 = new StringBuilder(input1);
		String s;
		for(int i=0;i<s1.length();i++) {
			s = s1.deleteCharAt(i).toString();
			if(s.contains(Character.toString(s2.charAt(i)))) {
				s1 = new StringBuilder(s2);
			} else {
				System.out.println(Character.toString(s2.charAt(i)));
				
			}
		}

	}
}

        
    
