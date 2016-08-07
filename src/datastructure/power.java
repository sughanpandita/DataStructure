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
import java.math.BigDecimal;
import java.math.BigInteger;
public class power {
     public static BigInteger powers(int[] list) {
     
      int length=list.length;
      
  
   double subsets= Math.pow(2,length);
  BigInteger gig=new BigDecimal(subsets).toBigInteger();
  return gig;
   
   
   
     }
     public static void main(String args[]){
        System.out.println("power"+powers(new int[]{1,2,3,4}));
         
     }
    
}
