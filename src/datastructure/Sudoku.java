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
public class Sudoku {
    
    
  
           
    
    public static void main(String[] Args){
        
        int sum=0;
        
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=ss.nextInt();
        System.out.println("Enter number of columns");
        int columns=ss.nextInt();
        int[][]array=new int[rows][columns];
        for(int i=0;i<rows;i++){
            
         for(int j=0;j<columns;j++){   
             
             
         array[i][j] = ss.nextInt();
         
         }
        }
        
        
       
        int[] colSum =new int[array[0].length];
        int[] rowSum =new int[array[0].length];
        
        for (int k=0;k<rows;k++ ){
            for(int l=0;l<array[k].length;l++)
            {    
                
                   
                 rowSum[k]=rowSum[k]+array[k][l];
                  colSum[l] += array[k][l];
                
                
            }
                   
                System.out.println("Print the sum of rows="+rowSum[k]);
                 
                   
                }
        for(int k=0;k<colSum.length;k++){
    System.out.println("Print the sum of columns =" + colSum[k]);
               
}
        
       
                    
           
            
                
            }
          
            
            
            
        }
        
        
    


               
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    

