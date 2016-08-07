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
public class CircularSorted {
    
     public boolean isCircleSorted(int[] a) {
         
         //length of array
         int length=a.length;
         int low=0;
         int high=length-1;
         int flag=0;
       
         
         int mid=(low+high)/2;
         int count=mid;
         
         for (int i=mid;i<length-1;i++){
             
             
             if(a[mid-1]<a[i]&&a[low]<a[i-1]){
                 
                count++;
                low++;
                 
             }
              if(a[low]>a[mid-1]&&a[mid-1]<a[i]){
                 
                 return true;
                 
             }
             
            
             
         }
         
       
      if(count==length-1&&low==mid){
          
          return true;
      }
       
      
      else{
             return false;
          
      }
    
    }
     public static void main(String args[]){
         
         CircularSorted cs=new CircularSorted();
         //true
         System.out.println("--------------True values:---------------");
         System.out.println(cs.isCircleSorted(new int[]{3,4,0,1,2}));
         System.out.println(cs.isCircleSorted(new int[]{4,5,6,9,1}));
         System.out.println(cs.isCircleSorted(new int[]{10,11,6,7,9}));
         System.out.println(cs.isCircleSorted(new int[]{1,2,3,4,5}));
         System.out.println(cs.isCircleSorted(new int[]{5,7,43,987,-9,0}));
         
         
         
          
           //false
           System.out.println("--------------------False values:--------------------------");
           System.out.println(cs.isCircleSorted(new int[]{7,6,5,4,3,2,1}));
           System.out.println(cs.isCircleSorted(new int[]{4,2,1,8}));
                  System.out.println(cs.isCircleSorted(new int[]{6,7,4,8}));
                         System.out.println(cs.isCircleSorted(new int[]{8,7,6,5,4,3}));
                                System.out.println(cs.isCircleSorted(new int[]{4,1,2,5}));
     }
    
}
