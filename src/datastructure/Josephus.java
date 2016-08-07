/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author Sughan Pandita
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
public class Josephus {
  public static <I> List<I> josephusPermutation(final List<I> items, final int k) {
      
   
    int len = items.size();
    int n = len;
    
    int[] indexArr = new int[len];
    int m =k-1;//start from 0,not 1
    //f(m,i)=(((m%(n-i)+k)%(n-i+1)+k)%(n-i+2)+k...)%n
    for (int i = 0; i < len; i++) {
      indexArr[i]=m%(len-i);
    }
    int j = 1;
    while (j <len) {
      for (int i = 0; i<len-j; i++) {
        indexArr[i+j] = (indexArr[i+j]+k) % (len-i);
      }
      j++;
    }
//    System.out.println(Arrays.toString(indexArr));
    return Arrays.stream(indexArr)
        .mapToObj(i -> items.get(i))
        .collect(Collectors.toList());

  }
   
  public static void main(String args[]){
      
     System.out.print( josephusPermutation(Arrays.asList(1,2,3,4,5,6,7), 3));
                                                                                
      
      
  }
}