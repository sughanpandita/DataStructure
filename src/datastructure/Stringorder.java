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
public class Stringorder {
    public static void order(String words) {
      String regex_string="[^A-Za-z0-9 ]";
      String regex_num="[A-Za-z\\s]";
      String format="";
      String [] ss_char=words.split(regex_string);
      String [] ss_num=words.split(regex_num);
      Arrays.sort(ss_num);
      
      
    
     
    
     
        

  }
    
    public static void main(String args[]){
        
      order("is2 Thi1s T4est 3a");
        
    }
}
