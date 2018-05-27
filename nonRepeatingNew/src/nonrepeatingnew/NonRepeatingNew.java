/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrepeatingnew;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class NonRepeatingNew {
String ar[];
	String ar1[];

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1");
		String input=sc.nextLine();
		System.out.println("Enter String2");
		String input1=sc.nextLine();
		String inputr=input.replaceAll("[ ,.!?0-9]", "");
		String input1r=input1.replaceAll("[ ,.!?0-9]", "");
		NonRepeatingNew fs =new NonRepeatingNew();
		fs.check(inputr, input1r);
		fs.check2(inputr, input1r);
}
	
	public void check(String inputr,String input1r) {
		 
		 ar=inputr.split("");
		 ar1=input1r.split("");
			
			for(int i=0;i<ar.length;i++) {
			
			for(int j=0;j<ar1.length;j++) {
				
				if(ar[i].equals(ar1[j])) {
					
					ar[i]="";
					
				}
			}
				System.out.print(ar[i]);
				
				
			}

}
	public void check2(String inputr,String input1r) {
		 
		 ar=inputr.split("");
		 ar1=input1r.split("");
			
			for(int i=0;i<ar1.length;i++) {
			
			for(int j=0;j<ar.length;j++) {
				
				if(ar1[i].equals(ar[j])) {
					
					ar1[i]="";
					
				}
			}
				System.out.print(ar1[i]+" ");
				
				
			}

}
}