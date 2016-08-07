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
import java.util.Scanner;
public class fibonacci {
    
    
  
    
        
        
        //////////////////without recursion
     /*if(f==0){
         
         System.out.println("0");
     }
     else if(f==1){
         
        System.out.println("1"); 
     }
     else{
         System.out.println("0");
         System.out.println("1");
         int a=0;
         int b=1;
         for (int i=1;i<f;i++){
             
             int next=a+b;
             System.out.println(next+"");
             a=b;
             b=next;
         }
         
         
     }
      */
     public static int fiboMach(int f){
         
         if(f==0){
             
             return 0;
             
         }
         else if(f==1){
             
             
             return 1;
         }
         else{
             
             return fiboMach(f-1)+fiboMach(f-2);
         }
     }
      
        
      
            
            
           
        
        
        
    
    public static void main (String args[]){
      
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){
            
            System.out.println(""+fiboMach(i));
                 
        }
        
        
    }
    
}
