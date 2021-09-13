/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertyfootball;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Phimporn
 */
public class Football implements Serializable {
    
    public static final String FOOTBALL_PROPERTY = "fooball";
    
    private String football;
    
    private PropertyChangeSupport propertySupport;
    
    public Football() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getFootball() {
        return football;
    }
    
    public void setFootball(String value) {
        String oldValue = this.football;
        this.football = value;
        propertySupport.firePropertyChange(FOOTBALL_PROPERTY, oldValue, this.football);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
