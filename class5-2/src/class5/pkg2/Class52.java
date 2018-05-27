/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5.pkg2;

/**
 *
 * @author Abhilash
 */
public class Class52 {

    /**
     * @param args the command line arguments
     */
 
        // TODO code application logic here
      
	String firstName;
	String lastName;
	
	public Class52(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	


	public static void main(String [] args) {
		 
		Class52 s1 = new Class52("abhilash","pochampally");
		Class52 s2 = new Class52 ("abhilash", "surya");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.firstName == s2.firstName);
	}
	
    }
    
