/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortnames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Abhilash
 */
public class SortNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       

        List<String> students= new ArrayList<String>();

        students.add("Abhilash");
        students.add("unnati");
        students.add("kavya");
        students.add("harinath");
        students.add("tilak");
        students.add("nandhini");
        students.add("kaveri");
        students.add("arun");
        students.add("shubam");
        students.add("koushik");
        students.add("krishna");
        if(!students.isEmpty()){

            Collections.sort(students);

            System.out.println(students);
        }
    }
}
    