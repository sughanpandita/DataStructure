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
public class StringPatter {
     public static void SongDecoder (String song)
  {
    char[] c=new char[100];
    for(int i=0;i<song.length();i++){
        
        c[i]=song.charAt(i);
        System.out.println(""+c[i]);
        
        if(c[i]=='W'&&c[i+2]=='B'){
            
           c[i]=c[i+1];
         
        }
    }
            
            
   }
     public static void main(String args[]){
         
         SongDecoder("WUBIWUBAWUBHERO");
         
     }
}
