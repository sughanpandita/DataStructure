
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sughan Pandita
 */
public class LeastNumber {
       public static List splitAndGiveList(String number){
int length=number.length();
List list=new ArrayList();
for(int i=0;i<length;i++){
String newNum=number.substring(0,i)+number.substring(i+1,length);
/*
the new number wil print this
4631
2631
2431
2461
2463
431
231
241
243
31
21
23
21*/
list.add(Integer.parseInt(newNum));
}
Collections.sort(list);//sort list in ascending
return list;
}

public static void findLeast(String number,int noOfDigit){
Integer leastNo=0;
for(int i=0;i<noOfDigit;i++){
leastNo=(Integer) splitAndGiveList(number).get(0);

number=leastNo.toString();
}
System.out.println(leastNo);
}
/**
* @param args
*/
public static void main(String[] args) {
findLeast("24631",3);//2--4631           //2---431        //2--31
                     //4--2631           //4--231(least)  //3--21
                     //6-2431(least)     //1--243         //1--23
}                    //3--2461
                     //1--2463


}




























