/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.duck;

/**
 *
 * @author Sughan Pandita
 */
public class RubberDuck extends Duck {
    public RubberDuck(){
        
        flightTaking=new CanntFly();
        quackSound=new Squick();
       
    }
    
}
