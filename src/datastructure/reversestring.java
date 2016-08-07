/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author Sughan Pandita
 */
public class reversestring {
    public static void main(String args[])throws IOException,FileNotFoundException{
        
      String str="Hi my name is tamuk";
      System.out.println("original string:"+str);
      String reverseBuff=new StringBuffer(str).reverse().toString();
       System.out.println("using reverse method:"+reverseBuff);
      
      
      String iteratorrev=reverseItr(str);
      System.out.println("Iterator reverse:"+iteratorrev);
      
     String iteratorRecur=reverseRec(str);
      System.out.println("Recursion string:"+iteratorRecur);
      
       }
    public static String reverseItr(String str)
    {
        StringBuilder strbuild=new StringBuilder();
        
        char[] ch=str.toCharArray();
        
        for (int i=ch.length-1;i>=0;i--)
        {
            strbuild.append(ch[i]);
            
        }
        
        return strbuild.toString();
        
    }
    
    public static String reverseRec(String str)
    {
        if(str.length()<2)
        {
            
            
            return str;
        }
        
        return reverseRec(str.substring(1))+str.charAt(0);
        
    }
    
    
    
    
}
    
    
    
    

