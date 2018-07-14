/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statesInNig;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
//import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
//import javax.inject.Named;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author angelis
 */

@ManagedBean(name="statesInNigeria")
@SessionScoped

//@Named(value="statesInNigeria")
//@SessionScoped

public class StatesInNigeria implements Serializable{
    
    private OurStates ourStates;
    private List <String> states;

    
    public StatesInNigeria(){
        }
    
    @PostConstruct
    public void init(){
        ourStates = new OurStates();
        states = Arrays.asList("Abia", "Anambra", "Zamfara", "Delta", "Kebbi");
    
    }

    public OurStates getOurStates() {
        return ourStates;
    }

    public void setOurStates(OurStates ourStates) {
        this.ourStates = ourStates;
    }

    public List<String> getStates(){
        return states;
    }

    
   
    
}

