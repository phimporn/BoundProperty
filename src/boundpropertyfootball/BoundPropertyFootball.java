/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertyfootball;

import java.util.Scanner;

/**
 *
 * @author Phimporn
 */
public class BoundPropertyFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Football Score Ex Thai 2-0 UAE \n Exit program Please Enter");
        String text = sc.nextLine();
        if("".equals(text)){
            System.out.println("No Text");
            return; //System.exit(0)
        }else{
        Football myFootball = new Football();
        Football1 football1 = new Football1();
        Football2 football2 = new Football2();
        myFootball.addPropertyChangeListener(football1);
        myFootball.addPropertyChangeListener(football2);
//        myFootball.setFootball(5);
        myFootball.setFootball(text);
//        myFootball.setFootball(6);
//        football.setInputData(text);
        }
    }
 }}
