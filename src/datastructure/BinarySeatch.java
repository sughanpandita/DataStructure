/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Scanner;

/**
 *
 * @author Sughan Pandita
 */
public class BinarySeatch {
    
    public static boolean contains(int [] a,int target)
    {
        
        
        int low=0;
        int high=a.length-1;
        while (low<=high )//range 0-9,5-9,5-6,5-5
        {
            
            int mid=(low+high)/2;
            if(target==a[mid])
            {
                System.out.println("element found:"+a[mid]);
                
                for(int iterate:a){
                    
                    System.out.println("element:"+iterate);
                     
                          }
              return true;
                
                
            }
            else if(target <a[mid])
            {
                high=mid-1;
                
                
            }
            else
                    {
                        
                        
                        low=mid+1;
                    }
            
        }
         System.out.println("element not found");
        return false;
        
        
    }
  public static void main(String args[]){
      
      BinarySeatch bs=new BinarySeatch();
    
      
      
      bs.contains(new int[]{1,3,5,7,10,18},10);
      
  }  
}
