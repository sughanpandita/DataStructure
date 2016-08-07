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
//123456789
//123465789
public class Missingnumber {
    
    //Method to find sum
    static public void findsum(int arr[],int elements){
        
        int arrSum=0;
        int sumElements=0;
        int elementMiss;
        for (int i=0;i<arr.length;i++){
            
            arrSum=arrSum+arr[i];
            sumElements=elements*(elements+1)/2;
            
          
        }
         
            elementMiss=sumElements-arrSum;
           System.out.println("Missing:"+elementMiss);
    }
    public static void main(String args[]){
        
            findsum(new int[]{1,2,3,4,5,7},7 );
            
        
        
        
    }
}
