/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Sughan Pandita
 */
public class onetohun {
    
    
    public static void main(String args[])throws Exception{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int N=Integer.parseInt(br.readLine());
        
        
        onetohun oh=new onetohun();
        
       oh.result(N);
    }
        public static void result(int N)
        
        
        {
            for(int i=0;i<N;i++)
            {
                if(i%3==0&&i%5==0)
                {
                    
                    System.out.println("fizzbuzz");
                    
                }
                else if(i%3==0){
                    
                    System.out.println("fizz");
                }
                else if(i%5==0){
                    
                    System.out.println("buzz");
                }
                if(i%3!=0&&i%5!=0)
                {
                    System.out.println("not result"+i);
                    
                }
                 
                
            }
            
            
        }
            
            
        }
        
        
        
    
    

