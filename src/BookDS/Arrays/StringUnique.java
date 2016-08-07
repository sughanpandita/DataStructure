/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookDS.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author Sughan Pandita
 */
/*public class StringUnique {
    
 static void stringUnique(String str){
       int count=0;
      for (int i=0;i<str.length();i++){
          for( int j=0;j<str.length();j++ ){
              if(str.charAt(i)==str.charAt(j)){
                  count++;
               }
            }
        }
       if(count==str.length()){
           System.out.print("unique");
        }
          else{
              
               System.out.print("not unique");
        }
          
}
public static void main(String args[]){
     
     stringUnique("sasa");
 }
   
    
}*/
// ....................using hashset...............
/*public class StringUnique {
    
  static void Hashstring(String str){  
      int count=0;
    HashSet<Character> uniquechar=new HashSet();
    boolean result=false;
    for(int i=0;i<str.length();i++){
        
        result=uniquechar.add(str.charAt(i));
        
        if(result==true){
            
          count++; 
        }
       
        
    }
     if(count==str.length()){
           System.out.print("unique");
        }
          else{
              
               System.out.print("not unique");
        }
    
        
 }
  public static void main(String args[]){
      Hashstring("helo");
      
  }
  
}*/
//.........................using colletion sort array list?*....................
/*public class StringUnique {
  
    public static boolean method3(String input)
    {
        ArrayList ar= new ArrayList();
        for (int i=0; i < input.length() ; i++ )
        {
            int j = input.indexOf(input.charAt(i));
            ar.add(j);
        }
        Collections.sort(ar);
        
        for (int i=0;i < (ar.size()-1);i++)
        {
            if (ar.get(i) == ar.get(i+1))
           
            return false;
          
        }
         
        return true;
       
    }
     public static void main(String args[]){
     System.out.println( method3("helo"));
    System.out.println( method3("hello"));
      
  }
    
}*/
//----------------------------using chatArray
public class StringUnique {
    static boolean chrArray(String ss){
        
        boolean result=false;
        
        for(char ch:ss.toCharArray()){
            if(ss.indexOf(ch)==ss.lastIndexOf(ch)){
                
                 System.out.println(ss.indexOf(ch));
                 System.out.println(ss.lastIndexOf(ch));
                result= true;
            }
            else{
                 System.out.println(ss.indexOf(ch));
                 System.out.println(ss.lastIndexOf(ch));
                
                 result=false;
                 break;
            }
            
        }
        return result;
        
    }
     public static void main(String args[]){
     System.out.println(chrArray("helo"));
    System.out.println( chrArray("hello"));
       System.out.println( chrArray("ooooo"));
    
      
  }
    
}

