/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhilash
 */
public class LoggerExample {

    /**
     * @param args the command line arguments
     */
    
	private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
	public static void main(String[] args) throws SecurityException, IOException {

		LOGGER.log(Level.INFO, "Logger Name: {0}", LOGGER.getName());
		
		LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
		
		//An array of size 3
		int []a = {1,2,3,4,5};
		int index = 4;
		LOGGER.log(Level.CONFIG, "index is set to {0}", index);
		
		try{
			System.out.println(a[index]);
		}catch(ArrayIndexOutOfBoundsException ex){
			LOGGER.log(Level.SEVERE, "Exception occur", ex);
		}
		

	}

}
    
    

