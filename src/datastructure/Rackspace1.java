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
public class Rackspace1 {
    
    
    public static void main(String args[] ) throws Exception { 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("Enter the value of N"); 
int N=Integer.parseInt(br.readLine()); 
Rackspace1 objSolution=new Rackspace1(); 
objSolution.fizzBuzz(N); 
} 
public static void fizzBuzz(int N) 
{ 

for(int i=0;i<=N;i++) 
{ 
if((i%5==0)&&(i%3==0)) 
{ 
System.out.println("fizzBuzz"); 
} 
else 
{ 
if((i%3)==0) 
{ 
System.out.println("Fizz"); 
} 
if((i%5)==0) 
{ 
System.out.println("Buzz"); 
} 
if((i%3!=0)&&(i%5!=0)) 
{ 
System.out.println(i); 
} 

} 
} 



} 
    
}
