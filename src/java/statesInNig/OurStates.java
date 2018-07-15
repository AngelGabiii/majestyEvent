/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statesInNig;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angelis
 */
public class OurStates {
    
    
     List<String> states ;
     
     public OurStates(){
     states = new ArrayList<>();
     states.add("Abia");
     states.add("Anambra");
     states.add("Bouchi");
     states.add("Benue");
     
     }

    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    
     
     
    
    
}
