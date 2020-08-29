/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class HumanTemperatures {
    
    private Human human;
    private ArrayList<Temperature> temps = new ArrayList<>();
    
    public HumanTemperatures() {
        
    }
    
    public HumanTemperatures(Human human, Temperature temp){
        setHuman(human);
        setTemp(temp);
    }
    
    public void setHuman(Human human){
        this.human = human;
    }
    
    public Human getHuman(){
        return(this.human);
    }

    public ArrayList<Temperature> getTemps() {
        return temps;
    }

    public void setTemp(Temperature temp) {
         temps.add(temp);
    }
    
    public float getTotalAverage(){
    
        float averageTemp = 0;
        
        for(int i = 0; i < temps.size(); i++) {
            averageTemp += temps.get(i).getAverage();
            
        }
        
        return averageTemp / temps.size();
    }

    @Override
    public String toString() {
        return "HumanTemperatures{" + "human=" + human + ", temps=" + temps + '}';
    }
    
    
    
    
    
    
}
