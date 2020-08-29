/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import models.Human;
import models.HumanTemperatures;
import models.Temperature;

/**
 *
 * @author mac
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Human {name}
            Temperature {float->temp1, temp2, temp3}
        
            getAverageTemp()
        
            More than one humans
        */
        
        
        Temperature temp1 = new Temperature((float) 36.8, (float) 36.6, (float) 38.5);
        
        
        
        HumanTemperatures ht = new HumanTemperatures(new Human("George"), 
                 new Temperature((float) 39.8, (float) 36.6, (float) 37.5));
        ht.setTemp(temp1);
        System.out.println(ht);
        System.out.println("Total average : " + ht.getTotalAverage());
        
        
        
        ht.getTemps().add(temp1);
        
        // ArrayList<HumanTemperatures>
        
    }
    
}
