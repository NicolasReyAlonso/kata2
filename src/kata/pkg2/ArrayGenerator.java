/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg2;

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
    public static Integer [] Generate_Random(int size, int min, int max){
        Integer [] data = new Integer[size];
        for (int i = 0; i < data.length; i++) {
            data[i] =(int) (Math.random()*((max-min)+1))+min;
        }
        return data;
    }
    
}
