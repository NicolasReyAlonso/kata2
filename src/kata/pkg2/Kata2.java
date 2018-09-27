/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg2;

import static java.lang.Math.random;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author nicolasreyalonso
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map <Integer, Integer> histogram = new HashMap <Integer, Integer>();
        Integer [] data = new Integer[15];
        for (int i = 0; i < data.length; i++) {
            data[i] =(int) (Math.random()*((20-0)+1))+0;
            
        }
   
        for (Integer key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
        System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); }
    }
    
    
}
