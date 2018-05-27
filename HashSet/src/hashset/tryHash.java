/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;
import java.util.HashSet;
/**
 *
 * @author Abhilash
 */
public class tryHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Integer> hash = new HashSet<>();

	        hash.add(10);
	        hash.add(20);
	        hash.add(10);
            System.out.println(hash);
    }
    
}
