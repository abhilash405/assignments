/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionreverse;
import java.util.*;
/**
 *
 * @author Abhilash
 */
public class CollectionReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Java program to demonstrate working of Collections.reveseOrder()

        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
            al.add(sc.nextInt());
        }
 
        Collections.sort(al, Collections.reverseOrder());
 
        System.out.println(al);
    }
}

    