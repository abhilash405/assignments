/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ndques;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author surya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) throws IOException {
	FileOutputStream fos=null;
		File mkdir=new File("C:\\abhilash");
if(!mkdir.exists()) {
	
	File file = new File("C:\\abhilash\\input.txt");
	System.out.println("creating directory " +mkdir.getName());
	System.out.println("creating File " + file.getName());
	

try {
	mkdir.mkdir();
	file.createNewFile();
	 fos =new FileOutputStream(file);

	String s="24";
	byte [] b=s.getBytes();
	fos.write(b);
	file.setReadOnly();
	
	
}catch(SecurityException se){
	System.out.println(se);
}

finally {
	fos.close();
}

}
    }
    
}
