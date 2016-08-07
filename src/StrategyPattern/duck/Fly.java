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

    public interface Fly{
        
        public String Fly();
        
        
    }



class ItFlys implements Fly{
    
    public String Fly(){
        
        
        return "This duck fly";
        
    }
    
}
class CanntFly implements Fly{
    
    public String Fly(){
        
        
        return "This Duck Cannot fly";
    }
    
    
}
    
    

