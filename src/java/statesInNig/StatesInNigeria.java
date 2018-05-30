/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statesInNig;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author angelis
 */
@RequestScoped
@ManagedBean(name="statesInNigeria")

public class StatesInNigeria implements Serializable{
    
    public List <String> states= Arrays.asList("Abia", "Adamawa", "Akwa-Ibom", "Anambra", "Bouchi");

    
    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }
    
    public StatesInNigeria(){
    }
    
    public void fetchStates(){
         for(Object ob: states){
            ob.toString();
        }
    }
    
}

