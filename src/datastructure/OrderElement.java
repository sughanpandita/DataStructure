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
//fnd kth largest/smallest elemst in array
public class OrderElement {
    
   public int  partition (int[] arr,int low,int high){
         
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
           
           if(arr[j]<=pivot){
               
               i++;
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        
        return i+1; 
    }
   
    
    void sort(int[]arr,int low ,int high){
        
        if(low<high){
            
            int parindex=partition(arr, low, high);
            
            sort(arr,low,parindex-1);
            sort(arr,parindex+1,high);
            
        }
   
        
        
        
        
    }
     public static void displayElements(int[] arr){
        
        for(int n:arr){
            
            System.out.println(""+n);
        }
        
    }    
     
    //to fin 
     public static void kthElement(int[]arr,int k){
         
         
         for(int i=0;i<=arr.length+1;i++){
             
            
             if(k==i){
             
             System.out.println("required elemenst at postion is:"+arr[k-1]);
             
             }
             
            
             
         }
         
     }
     
     
     
     public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        
         int[] arr={12, 3, 5, 7, 4, 19, 26};
         int n=arr.length;
         OrderElement oe=new OrderElement();
         oe.sort(arr, 0, n-1);
         
         System.out.println("sorted elements");
         displayElements(arr);
          System.out.println("enter element to get value");
         int element=sc.nextInt();
       
         
        
         kthElement(arr,element);
         
         
         
     }
    
    
    
    
   
        
    }
    
    

