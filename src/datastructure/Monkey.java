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
import java.util.ArrayList;
import java.util.*;

class Monkey {
   static public int Monkey(int[] A, int D) {
 HashSet<Integer> hashset = new HashSet<Integer>();
 
 
        for (int m = 0 ; m < A.length; m++) {
            if (A[m] <= D)
               hashset.add(A[m]);   
            if (hashset.size() == D)
              
               return m;
              System.out.println("size"+hashset.size());
        }

        return -1;
        
    }
    
    
    
    public static void main(String args[]){
        
        System.out.println(Monkey( new int[]{1, -1, 0, 2, 3, 5},3));
    }
}
