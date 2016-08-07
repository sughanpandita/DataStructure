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

public interface Quack{
    
    public String quack();
    
}




 class QuackSound implements Quack{
    
    
    public String quack(){
     
      return "produce quack sound";
     
    }
    
}
class Squick implements Quack{
    
    
    public String quack(){
     
      return "produce Squick sound";
     
    }
    
}
class MuteQuack implements Quack{
    
    
    public String quack(){
     
      return "produce MuteQuack sound";
     
    }
    
}
