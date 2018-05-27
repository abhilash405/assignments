/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Abhilash
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={56,71,34,11,18,72};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
