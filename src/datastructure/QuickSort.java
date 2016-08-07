/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import static datastructure.OrderElement.kthElement;

/**
 *
 * @author Sughan Pandita
 */
public class QuickSort {
    
    public  int partition(int[] arr,int low ,int high){
        
        int pivot =arr[high];
        int i=low-1;
        for (int j=low;j<=high-1;j++){
            
            if( arr[j]<=pivot){
                
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
    
    void sort(int arr[],int low ,int high){
        
        
        if(low<high){
            
            int pi=partition(arr,low,high);
            sort(arr,low,pi-1);
             sort(arr,pi+1,high);
            
            
           }
            
            
        }
    public static void printArray(int arr[]){
        
        for(int n:arr){
            
            
            System.out.println(""+n);
            
            
        }
        
    }
    public static void kthElement(int[]arr,int k){
         
         
         for(int i=0;i<=arr.length+1;i++){
             
            
             if(k==i){
             
             System.out.println("required elemenst at postion is:"+arr[k-1]);
             
             }
            
             
         }
         
     }
   
    
    public static void main(String args[])
    {
        int arr[] = {2,1,3,5,9,10,67};
        int n = arr.length;
 
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
 
        System.out.println("sorted array");
        printArray(arr);
        kthElement(arr,7);
    }
    }
    
    
    
     //partition 
   
