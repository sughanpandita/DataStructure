/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author Sughan Pandita
 */
public class demo1 {
    public static void validPhoneNumber(String s) {
    String first_part=s.substring(0,s.length()/2);
            String second_part=s.substring(s.length()/2,s.length());
          
         
     System.out.print(first_part);
      System.out.print(second_part);
     
    

            
            
            
            
            
            
    }
      public static void main(String args[]){
         
     validPhoneNumber("codewars");
     
    
}
}
