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
public class reverse {
    
    
  public static void inputReverse(int[] list) {
  int[] result = new int[list.length];

  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
    result[j] = list[i];
  }
   for(int i:result)
   {
        System.out.println("output"+i);
   }
 
  
}
public static void main (String args[])
{
    reverse rv=new reverse();
    
    
    
    rv.inputReverse(new int[]{1,2,3,4,5,6});
    
    
}


  
}
