/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Abhilash
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Item> list = new ArrayList<>();
	list.add(new Item("Biryani",6,"Chicken"));
       list.add(new Item("pulao",4,"mutton"));
       for(Item i: list)
            System.out.println(i.toString());
	}
}


