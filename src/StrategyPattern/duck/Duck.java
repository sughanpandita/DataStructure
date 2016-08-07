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
public class Duck {
    
    public Fly flightTaking;
    public Quack quackSound;
    
    public String tryToFly(){
        
        return flightTaking.Fly();
        
    }
    
    public void setFlyingAbility(Fly newflighttype){
        
         flightTaking=newflighttype;    
        
    }
    
     public String tryTosound(){
        
        return quackSound.quack();
        
    }
     public void setSoundAbility(Quack newsoundtype){
        
        quackSound=newsoundtype ;    
        
    }
    
    
}
