/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertyfootball;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Phimporn
 */
public class Football1 implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(
//                evt.getNewValue());//To change body of generated methods, choose Tools | Templates.
         "Live result : " + evt.getNewValue());
//          "Live result football 1 : " + ((Football)sourceFootball).getInputData());
    }
    
}
