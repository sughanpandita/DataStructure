/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

/**
 *
 * @author Sughan Pandita
 */
public class demo {
    public static boolean validPhoneNumber(String phoneNum) {
        
        

     
        
    
          
         // return Pattern.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$", phoneNumber);
       
         if(phoneNum.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")){
             
             return true;
         }
         else{
             
             return false;
         }
         
         
       // String s= String.valueOf(phoneNum).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        
    }

     public static void main(String args[]){
         
     System.out.print(validPhoneNumber("(123) 456-7890"));
     
    
}
}
