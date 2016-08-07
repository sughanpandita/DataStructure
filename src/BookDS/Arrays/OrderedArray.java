/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookDS.Arrays;

/**
 *
 * @author Sughan Pandita
 */

class OrderedBinarySearch {
    
  private  long[] array;
  private int nElements;
    //constructor
    public OrderedBinarySearch(int max){
        
        array=new long[max];
        nElements=0;
        
    }
    public int size(){ 
    return nElements; }
    
    //display item
    public void display(){
        
        for(int i=0;i<array.length;i++){
            
            
            System.out.println(""+array[i]);
               System.out.println(" ");
        }
        
    }
    //find item
    
    public int find(long searchkey){
        
        int low=0;
        int high=array.length-1;
        int mid=(low+high)/2;
        while (true){
            
            if(array[mid]==searchkey){
                return mid;
            }
            else if(low>high){
                
                return nElements;
            }
            else if(array[mid]<searchkey){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
            
        }
        
        
    }
    
    public void insert(long value){
        
        for(int j=0;j<nElements;j++){
            
            if(array[j]>value){
                
                break;
                
            }
        for(int k=nElements;k>0;k--){
            
            
            array[k]=array[k-1];
            array[j]=value;
            nElements++;
        }
        }
        
    }
    
    
    public boolean delete(long value){
        
        int j=find(value);
        if(j==nElements)
            
            return false;
        
        else{
            for(int k=0;k<nElements;k++)
                
                array[k]=array[k+1];
               nElements--; 
        }
           return true;
        
    }
    
}
public class OrderedArray {
    public static void main(String args[]){
    OrderedBinarySearch obs=new OrderedBinarySearch(100);
    obs.insert(77);
     obs.insert(99);
      obs.insert(44);
       obs.insert(22);
        obs.insert(88);
    
    int searchkey=44;
    if(obs.find(searchkey)!=obs.size()){
        System.out.println("found" + searchkey);
        
    }
    else{
         System.out.println("key not found");
        
        
    }
    obs.display();
    obs.delete(99);
    obs.delete(22);
    
    obs.display();
    
    
    }
    
}
        
    

