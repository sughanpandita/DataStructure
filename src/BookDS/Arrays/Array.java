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
public class Array {
    
    public static void main(String args[]){
        int maxSize=100;
        
        HighArray HA=new HighArray(maxSize);
        HA.insert(77);
        HA.insert(33);
        HA.insert(44);
        HA.insert(23);
        HA.insert(12);
        HA.insert(67);
        HA.insert(93);
        HA.insert(11);
        
        HA.display();
     //-----------------------------search   
        int searhkey=23;
        
        if(HA.find(searhkey)){
            
             System.out.println(""+searhkey);
        }
        else{
             System.out.println("Key not found");
            
        }
      //-------------------------------delete
        HA.delete(77);
        HA.delete(11);
         System.out.println("new array element after deletion");
        HA.display();
        
    }
    
}
class HighArray{
    
    private long[] arr;
    private int nElements;
    
    public HighArray(int max){
        
        arr=new long[max];
        nElements=0;
        
     }
//---------------------display
    public void display(){
        int j;
        
        for(j=0;j<nElements;j++){
            
            System.out.print(""+arr[j]);
            System.out.println("");
            
        }
        
        
    }
//------------------------find
     public boolean find(long searchKey){
         int j;
         
         for(j=0;j<nElements;j++)
             
             if(arr[j]==searchKey)
                 
                break;
                 
            
             if(j==nElements)
                 
              return false;
                 
             
             else
                 
                  return true;
             
             
         
     }
 //-------------------------------insert    
     public void insert(long value){
         
         arr[nElements]=value;
         nElements++;
         
     }
// ------------------------------delete
     public boolean delete(long deleteElm){
         int j;
         for(j=0;j<nElements;j++)
             
             if(deleteElm==arr[j])
                 
                 break;
                 
             
             if(j==nElements)
                 
                 return false;
                 
                
             else
                 
                 for(int k=j;k<nElements;k++)
                     
                     arr[k]=arr[k+1];
                     nElements--;
                     return true;
     }
}

    
         
         
       
    
    
    

