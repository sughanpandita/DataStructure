/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Arrays;

/**
 *
 * @author Sughan Pandita
 */
public class stringchecker {
       public static boolean isMerge(String s, String part1, String part2) {
           
           String original=part1+part2;
           int count=0;
          
           String first_part=s.substring(0,s.length()/2);
            String second_part=s.substring(s.length()/2,s.length());
           char[] org_char=s.toCharArray();
           char [] added_char=original.toCharArray();
           char[] order_array=new char[s.length()];
           Arrays.sort(org_char);
           Arrays.sort(added_char);
           
        
         
          
           
           
          //check by order
          
           
          if(s.isEmpty()&&part1.isEmpty()||s.isEmpty()&&part2.isEmpty()){
              
              return true;
          }
          if(s.isEmpty()&&!part1.isEmpty()||s.isEmpty()&&!part2.isEmpty()){
              
              return false;
              
          }
          if(Arrays.equals(org_char, added_char)){
              
              return true;
              
          }
         /* if(first_part==part1&&second_part!=part2){
          for(int i=0;i<s.length()/2;i++){
              if(s.charAt(i)==part1.charAt(i)){
                  
                  count++;
                  break;
              }
              if(s.charAt(i+1)==part2.charAt(i)){
                  
                  
                  count++;
                  break;
              }
          }
          }
          if(count==s.length()){
              
              
               return true;
              
          }*/
        
           
          
          //order
          
          
         
           
      return false;
            
       }
       
       
       public static void main (String args[]){
           
          System.out.println( isMerge("codewars", "code", "wars"));
           System.out.println( isMerge("codewars", "cdwr", "oeas"));
           System.out.println( isMerge("codewars", "cod", "wars"));
           System.out.println( isMerge("codewars", "code", "uits"));
           System.out.println( isMerge("codewars", "co", "u"));
           System.out.println( isMerge("codewars", "ertye", "uitsds"));
         System.out.println( isMerge("codewars", "llll", "pppp"));
          System.out.println( isMerge("codewars", "code", "wasr"));
           System.out.println( isMerge("codewars", "", ""));
           System.out.println( isMerge("", "s", "t"));
           System.out.println( isMerge("", "", "t"));
           
           
           
           
       }
               
               
               
    
}
