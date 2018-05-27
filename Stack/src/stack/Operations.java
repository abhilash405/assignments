/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.Stack;
/**
 *
 * @author Abhilash
 */
public class Operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

		Stack s=new Stack();

		s.push(10);

		s.push(20);

		s.push(60);

		s.push(30);

		s.push(45);

		s.push(50);

		System.out.println("Elements in the stack"+s);

		s.pop();

		System.out.println(s);

		System.out.println(s.isEmpty());

		      System.out.println(s.contains(50));

		
	}
}
    

