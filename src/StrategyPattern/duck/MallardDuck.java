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
public class MallardDuck extends Duck{
    
    public MallardDuck(){
        
        flightTaking=new ItFlys();
        quackSound=new QuackSound();
       
    }
    
    
    
}
