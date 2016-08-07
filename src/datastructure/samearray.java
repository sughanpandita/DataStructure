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
public class samearray {
    public static boolean  comp(int[] a, int[] b) {
        
  int[] bb = b;
    int[] aa = a;
    int count = 0;
    if(a==null&&b==null){
        return true;
    }
    if(a==null&&b!=null){
        return false;
    }
    if(a!=null&&b==null){
        return false;
    }
        for(int i =0;i<bb.length;i++){
            for(int j=0;j<aa.length;j++){
                if(aa[j]*aa[j]==bb[i]){
                    //if(aa[j]>=0){
                      //  aa[j]+=j+1;
                    //}else{
                    //    aa[j] += 1;
                    //}
                    count++;
                    break;
                }
            }
        }
    
    if(count==bb.length){
        return true;
    }
    return false;
  }

    public static void main(String args[]){
        
         System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11},new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
        
        
    }
    
}
   /*  
       if (a == null || b == null) return false;
        if (a.length != b.length) return false;

        int[] sortedA = Arrays.stream(a).map(x -> x*x).sorted().toArray();
        int[] sortedB = Arrays.stream(b).sorted().toArray();
        return Arrays.equals(sortedA, sortedB);
  }
    public static void main(String args[]){
        
         System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11},new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361}));
        
        
    }
    */
/*
public class AreSame {
  
  public static boolean comp(int[] a, int[] b) {
    int[] bb = b;
    int[] aa = a;
    int count = 0;
    if(a==null&&b==null){
        return true;
    }
    if(a==null&&b!=null){
        return false;
    }
    if(a!=null&&b==null){
        return false;
    }
        for(int i =0;i<bb.length;i++){
            for(int j=0;j<aa.length;j++){
                if(aa[j]*aa[j]==bb[i]){
                    //if(aa[j]>=0){
                        aa[j]+=j+1;
                    //}else{
                    //    aa[j] += 1;
                    //}
                    count++;
                    break;
                }
            }
        }
    
    if(count==bb.length){
        return true;
    }
    return false;
  }
}
*/
