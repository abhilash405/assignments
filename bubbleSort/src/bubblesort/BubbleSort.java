/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;


/**
 *
 * @author Abhilash
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int arr[] ={3,60,35,2,45,320,5};  
          
        int temp = 0;  
         for(int i=0; i < arr.length; i++){  
                 for(int j=1; j < (arr.length); j++){    
                          if(arr[j-1] > arr[j]){                                
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                          }
                 }
         }
         System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
    }
}
}

