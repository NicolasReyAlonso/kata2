/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nicolasreyalonso
 */
public class Histogram {
    private final Integer [] data;
    public Histogram(Integer [] data){
        this.data = new Integer[data.length];
        for (int i = 0; i < data.length; i++) {
            this.data[i] = data[i];
        }
    }

    public Integer[] getData() {
        return data;
    }
    
    public Map <Integer, Integer> getHistogram(){
        Map <Integer, Integer> histogram = new HashMap <Integer, Integer>();

        for (Integer key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
    
        return (histogram);
    }



    
}
