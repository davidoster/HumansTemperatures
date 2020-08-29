/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mac
 */
public class Temperature {
    
    private float temp1;
    private float temp2;
    private float temp3;
   
    
    public Temperature(){
    }
    
    public Temperature(float temp1, float temp2, float temp3){
        setTemps(temp1, temp2, temp3);
    }
    
    public void setTemp1(float temp1){
        this.temp1 = temp1;
    }
    
    public void setTemp2(float temp2){
        this.temp2 = temp2;
    }
    
    public void setTemp3(float temp3){
        this.temp3 = temp3;
    }
    
    public void setTemps(float temp1, float temp2, float temp3){
        setTemp1(temp1);
        setTemp2(temp2);
        setTemp3(temp3);
    }
    
    public float getTemp1(){
        return(this.temp1);
    }
    
    public float getTemp2(){
        return(this.temp2);
    }
    
    public float getTemp3(){
        return(this.temp3);
    }
    
    public float getAverage(){
        return((this.temp1 + this.temp2  + this.temp3) / 3 );
    }

    @Override
    public String toString() {
        return "Temperature{" + "temp1=" + temp1 + ", temp2=" + temp2 + ", temp3=" + temp3 + '}' + " Average: " + getAverage();
    }
    
    
    
    
    
}
