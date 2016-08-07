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
public class Animals {
    
    public Flys flighttaking;
    
    public  String tryToFly(){
        
        return flighttaking.fly();
    }
    public void setFlyingAbility(Flys newflighttype)
    {
        flighttaking=newflighttype;
        
    }
    
}
