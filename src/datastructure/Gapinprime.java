/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.List;

/**
 *
 * @author Sughan Pandita
 */
public class Gapinprime{
    
  public static void gap( int g,long m, long n) {
      
     
      int large=(int) n;//coversion of r
      int small=(int) m;
      long[] arr=new long[large];
      //loop through the array
     
      //inseting  item in array
      for(int j=small;j<=arr.length;j++){
           for (int i=0;i<=n;i++){
        if(j%2!=0){
             
             arr[i]=j;
          
        }  
        
        }
      if(arr.length==large){
                   
              break;
      
      }   
  }
        
  }
  
 public static void main(String args[]){
     
     
     gap(4, 100, 110);
 }
    
}
