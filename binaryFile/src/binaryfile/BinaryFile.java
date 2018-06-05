/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryfile;
import java.io.*;
 
/**
 *
 * @author surya
 */


public class BinaryFile {

	public static void main(String[] args) {
        String sourceFile = "C:\\New folder\\image.jpg";
        String destFile = "C:\\New folder\\output.jpg";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {

            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile);
            byte[] buffer = new byte[2048];
            int noOfBytes = 0;
            System.out.println("Copying file using streams");
            while ((noOfBytes = fis.read(buffer)) != -1) {

                fos.write(buffer);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        }
        catch (IOException ioe) {
            System.out.println("Exception while copying file " + ioe);
        }
        finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }
}

	
  
