/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author Sughan Pandita
 */
public class AnimalPlay {
    public static void main(String[] args){
        
        Animals sparky=new Dogs();
        Animals tweety=new Birds();
        
        System.out.println("Dog:"+sparky.tryToFly());
        System.out.println("Tweety:"+tweety.tryToFly());
        sparky.setFlyingAbility(new itFlys());
        System.out.println("Dog:"+sparky.tryToFly());
        sparky.setFlyingAbility(new cntFlys());
        System.out.println("Dog:"+sparky.tryToFly());
           
       
        
    }
    
}
