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

  public interface Flys{
    
    String fly();
    
   }
class itFlys implements Flys
{
     public String fly(){
         
         return "It Flys";
         
     }
}
class cntFlys implements Flys{
    
    public String fly(){
        
        return "Cannot Flys";
    }
}
    

