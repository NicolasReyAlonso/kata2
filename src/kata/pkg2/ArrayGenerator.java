/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg2;

import java.nio.charset.Charset;

/**
 *
 * @author nicolasreyalonso
 */
public class ArrayGenerator {
    /**
     * 
     * @param size size of the array
     * @param min minimun value to be stored in the array
     * @param max maximun value to be stored in the array
     * @return an array containing randonmly generated Integer from min to max
     */
    public static Integer [] Generate_Random_Numeric(int size, int min, int max){
        Integer [] data = new Integer[size];
        for (int i = 0; i < data.length; i++) {
            data[i] =(int) (Math.random()*((max-min)+1))+min;
        }
        return data;
    }
    
    /**
     * 
     * @param size size of the array
     * @param StrSize Legth of the string to be generated
     * @return an array containing randonmly generated String from a to z
     */
    public static String [] Generate_Random_String(int size, int StrSize){
        String [] data = new String[size];
        byte [] bytes = new byte[StrSize];
        for (int i = 0; i < data.length; i++) {
            
            for (int j = 0; j < StrSize; j++) {
                bytes[j] = (byte) ((byte) (Math.random()*((122-97)+1))+97);
                
            }
            
            data[i] = new String(bytes, Charset.forName("UTF-8"));
        }
        return data;
    }
    
}
