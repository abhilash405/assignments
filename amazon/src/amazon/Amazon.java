/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.Scanner;

/**
 *
 * @author Abhilash
 */
public class Amazon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        	Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
		
		int j=0;
                
		for(int i=0; i<s.length();) {
			String subS = "";			
			while(true && j<s.length()-1) {				
				char a = s.charAt(j);				
				char b = s.charAt(j+1);
				if((int)a < (int)b) {
					if(subS.length() == 0) {
						subS = subS.concat(Character.toString(a)).concat(Character.toString(b));
					} else {
						subS = subS.concat(Character.toString(b));
					}										
					j++;
				} else {
					i=j+1;
					j++;
					break;
				}
			}
			recursion(subS);
                }
                
		    
	}
    
	private static void recursion(String subS) {				
		while(subS.length()>=2) {
			recursion2(subS);
			subS = subS.substring(subS.length()-(subS.length()-1));
		}		
	}

	private static void recursion2(String subS) {
		while(subS.length()>=2) {
			System.out.println(subS);
			subS = subS.substring(0, subS.length()-1);						
		}		
	}

}

