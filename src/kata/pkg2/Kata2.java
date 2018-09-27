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
        String [] data = ArrayGenerator.Generate_Random_String(10, 5);
        Histogram histr = new Histogram(data);
        Map <String, Integer> histo = histr.getHistogram();
   
        for (Map.Entry<String, Integer> entry : histo.entrySet()) {
        System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); }
    }
    
    
}
