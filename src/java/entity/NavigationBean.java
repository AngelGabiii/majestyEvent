/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Angelis
 */
@SessionScoped
@ManagedBean(name = "navBean")

public class NavigationBean implements Serializable {

    public NavigationBean() {
    }

    public String toUsherSingUp() {
        return "usherSingUp.xhtml";
    }

    public String toAdminArea() {
        return "adminPage.xhtml";
    }
 
    public String toAdminArea2() {
        return "adminPage2.xhtml";
    }
    
    public String toViewRegisteredUshers(){
    
        return "viewRegisteredUshers.xhtml";
    }
    
    public String content1(){
        String contentA1= "You can click on any of navigation links in the left section to find out more";
        return contentA1;
    }
    
}
