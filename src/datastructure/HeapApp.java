/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.Heap;

import java.util.Scanner;

/**
 *
 * @author Sughan Pandita
 */
public class HeapApp {
    public static void main(String[] args){
        Heap<Integer> heap=new Heap<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter next int,'done' to stop");
        String line=sc.next();
        while(!line.equals("done")){
            
            heap.insetItems(Integer.parseInt(line));
            System.out.println(heap);
            System.out.println("Enter next int,'done' to stop");
            line=sc.next();
        }
        while(!heap.isEmpty()){
            
            int max=heap.delete();
            System.out.print(max+""+heap);
        }
        
        
        
        
        
        
        
    }
}
