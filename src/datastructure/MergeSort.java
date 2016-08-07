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
public class MergeSort {
    
    
    
    
    public void sort(int arr[],int l,int r){
        
            if(l<r){
                
                int m=(l+r)/2;
                sort(arr,l,m);
                sort(arr,m+1,r);
                merge(arr,l,m,r);
            }       
        
        
        
        
    }
  public void merge(int arr[],int l,int m,int r){
      
      int left=m-l+1;
      int right=r-m;
      
      
      int L[]=new int[left];;
      int R[]=new int[right];
      
      for(int i=0;i<left;i++){
          L[i]=arr[l+i];
       }
      for(int j=0;j<right;j++){
          R[j]=arr[m+1+j];
       }
      int k = l;
      int i=0,j=0;
        while (i < left && j < right)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
         /* Copy remaining elements of L[] if any */
        while (i < left)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (j < right)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
      
}
  public static void printArray(int [] arr){
      
      for(int n:arr){
          
          System.out.println(""+n);
          
      }
  }
  public static void main(String args[]){
      
      int arr[]={12,11,13,5,6,7};
      System.out.println("Given Array");
      printArray(arr);
      MergeSort ms=new MergeSort();
      ms.sort(arr, 0, arr.length-1);
      System.out.println("sorted Array");
      printArray(arr);
              
      
  }
}
