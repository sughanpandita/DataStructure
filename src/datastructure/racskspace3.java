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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class racskspace3 {
    
    
    
    public static void main (String[] args)throws IOException,FileNotFoundException
    {
        String real="Hi my name is sughan";
      
        
        String iter=reverseIterator(real);
        System.out.println("using iterator"+iter);
        String recur=reverseRecu(real);
        System.out.println("using iterator:"+recur);
        
    }
    
    
    
    public static String reverseIterator(String str)
    {
        StringBuilder bf=new StringBuilder();
        char[] ch=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            
            
            bf.append(ch[i]);
        }
        return bf.toString();
   }
    public static String reverseRecu(String str)
    {
       if(str.length()<2)
       {
            return str;
           
           
       }
       
       else{
           
           return reverseRecu(str.substring(1)+str.charAt(0));
           
       }
   }
    
    
    
}


