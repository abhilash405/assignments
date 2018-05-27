/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allnonrepeating;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class AllNonRepeating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1");
		String s1=sc.nextLine();
		System.out.println("Enter String2");
		String s2=sc.nextLine();
	   StringBuilder sb = new StringBuilder();
	   
	   String s3= s1+s2;
	   char c[]= s3.toCharArray();
	 for(int i=0;i<sb.length();i++) {
	   for(int j=i+1;j<sb.length();j++)  {
		   if(c[i]!=c[j]) {
			  sb.append(c[i]);
		   }
	   }
	   }
	 System.out.println(sb);
	}
}