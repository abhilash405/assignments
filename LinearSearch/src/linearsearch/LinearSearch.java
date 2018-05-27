/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;
import java.io.*;


/**
 *
 * @author Abhilash
 */
public class LinearSearch {
    
        // TODO code application logic here
        public static int linearSearch(int[] arr, int key){
             
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }                       
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 90;    
        long start = System.nanoTime();
        int index= linearSearch(a1, key);
        long end = System.nanoTime();
        System.out.println("time taken to find the element is " +(end - start) + "ns");
        System.out.println(index);    
    }    
}    
    

      
      
     