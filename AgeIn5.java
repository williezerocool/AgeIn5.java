/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agein5;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class AgeIn5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        
        String userName;
        int userAge;
      
        System.out.print("Hello! What is your name? ");
        userName = keyboard.next();
        
        System.out.print("Hi, " + userName + "!" + " How old are you? ");
        userAge = keyboard.nextInt();
        
        System.out.println("Did you know that in five years you will be " + (userAge + 5) + " years old?\n And five years ago you were " + (userAge - 5) + " imagne that" );
    }
    
}
