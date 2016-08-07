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
public class mumbing {
      public static String accum(String s) {
          
          int length=s.length();
         int ch=0; 
       
          
          for(int i=0;i<=length-1;i++){
              
              if(length==1){
                  
                  char c=s.charAt(ch);
                  String first=(String)s.toUpperCase();
                
                   System.out.print(""+first);
              }
              else if(length>1){
                  
                  char c=s.charAt(ch);
                 
                   ch++;
                  
                   String first =String.valueOf(c).toUpperCase();
                    int position=s.indexOf(c);
                   if(position==0){
                  
                      System.out.print(""+first);
                      
                  }
                  
                  else{
                      
                 
                      System.out.print("-"+first);
                  }
                   
                   
                      
                   for(int j=0;j<=position-1;j++){
                      
                       
                        
                       
                 
                    
                  String lower=""+c;
                  String mumbling=lower.toLowerCase();
                  
                  
                   System.out.print(""+mumbling);
              
                      
                  }
                 
                  
                  
              }
          
              
          }
          
     return "";
    }
      public static void main(String args[]){
          
         accum("MjtkuBovqrU");
      }
      

    
}
