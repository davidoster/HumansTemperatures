/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Objects;

/**
 *
 * @author mac
 */
public class Human {
    
    
    /*
    public
    protected
    (default)
    private
    */
    private String name;
    
    public Human() {
        
    }
    
    public Human(String name) {
        setName(name);
    }
    
    public void setName(String name) {
        this.name = name.toUpperCase();
    }
    
    public String getName() {
        return(this.name);
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Human other = (Human) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
