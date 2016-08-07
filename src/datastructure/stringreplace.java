/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Arrays;

/**
 *
 * @author Sughan Pandita
 */
public class stringreplace {
	static void encode(String word){
  int length=word.length();
  for(int i=0;i<=length+1;i++){
  char [] chr=new char[length];
  
 
  chr[i]=word.charAt(i);
  chr[i+1]=word.charAt(i+1);
  Arrays.sort(chr);
  
  
  
 if (chr[i]==chr[i+1]){
      chr[i]=')';
      chr[i+1]=')';
      
      
        System.out.println(""+chr[i]);
         System.out.println(""+chr[i+1]);
      
   }
  else {
    System.out.println("(");
  }
  
  }
  }
        
  public static void main(String args[]){
  
  encode("success");
  
  }
  
}
