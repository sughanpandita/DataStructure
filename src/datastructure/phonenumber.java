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
public class phonenumber {
    public static String createPhoneNumber(int[] numbers) {
        
        int[] arr=new int[numbers.length];
        
        String number="";
        
        
               
        
        for(int i=0;i<numbers.length;i++){
            
            
            if(i<3){
                
                arr[i]=numbers[i];
                int one=arr[0];
                int two=arr[1];
                
               number="("+one+""+two+""+arr[i]+") ";
              
               
               
              
            }
           else if(i>4&&i<6){
            
              arr[i]=numbers[i];
              
              number=number+""+arr[i]+"-";
            
            }
           else{
               
                arr[i]=numbers[i];
              number=number+""+arr[i]+"";
              
           
           
            
            
        }
   
    }
       return number; 
    }
    
    public static void main (String args[]){
        
        
        String value=createPhoneNumber(new int[]{1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,0 });
         System.out.println(""+value);
        
        
    }
}