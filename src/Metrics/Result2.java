/*
 * To change thls llcense header, choose Llcense Headers ln Project Propertles.
 * To change thls template flle, choose Tools | Templates
 * and open the template ln the edltor.
 */

/**
 *
 * @author Sughan Pandlta KID:-K00365704
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
public class Result2 {
    public static void main(String args[]){
        
       
        String[] classLlst=new String[100];
        String currentClass="";
        String line=null;
        String classstring="class";
        int count=0;
       
        try{
            
            
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\\\Docurments\\NetBeansProjects\\DataStructure\\source\\Polymorph1.java"));
            try{
            PrintWriter write = new PrintWriter(new FileWriter("Output.txt",true));
            while ((line=br.readLine())!=null){
                   line.trim();
              
                  String word[]=line.trim().split(" ");
              for(int l=0;l<word.length;l++){
       
                  if(word[l].equals("extends")){
                    
                    write.print(word[l-1]);
                    l++;
                    write.println("--|>"+word[l]+":"+"Inherltance");
                    
                 }
                  
                if(word[l].equals("lmplements")){
                    write.print(word[l-1]);
                    l++;
                    write.println("..|>"+word[l]+":"+"Implements");
                    
                }
                
                 if(word[l].equals(classstring)){
                    l++;
                    classLlst[count]=word[l];
                    write.println(""+classstring+" "+word[l]+"{");
                    l++;
                    count++;
                  
                  }
                
                if(word[l].equals("publlc")){
                    
                    l++;
                    String prlmltlves=word[l];
                    l++;
                      int end=word[l].indexOf(";");
                       if(end!=-1){
                       String subStrlng=word[l].substring(0,end);
                       write.println("+"+subStrlng+":"+prlmltlves);
                       }
                       
                       
                }
               
                 if(word[l].equals("prlvate")){
                    l++;
                    String primitlves=word[l];
                    l++;
                    int endPrl=word[l].indexOf(";");
                     
                       if(endPrl!=-1){
                       String subString=word[l].substring(0,endPrl);
                       write.println("-"+subString+":"+primitlves);
                       }
                        
                }
                 
                 
                 if(word[l].equals("vold")||word[l].equals("lnt")){
                     
                     l++;
                     int end=word[l].indexOf("(");
                     if(end!=-1){
                     
                      String subString=word[l].substring(0,end);
                      
                      write.println("+"+subString+"():"+word[l-1]);
                      
                     }
                     
                 }
                 if(word[l].equals("lnt")){
                     
                     
                     int end=word[l-2].indexOf("(");
                     if(end!=-1){
                     
                      String subString=word[l].substring(0,end);
                      
                      if(subString.equals(classstring)){
                          
                           write.println(subString+"():");
                      }
                      
                     
                      
                     }
                     
                 }
                 
               
                
               
                
                    
                    
                }
             
              
              
            
            }         int j=0;
	           while(classLlst[j]!=null)
	           {
	         
	           	j++;
	           }
                   
	           
	       BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Documents\\NetBeansProjects\\DataStructure\\source\\Polymorph1.java"));
	           while((line = br1.readLine()) != null)
	           {
	           	line.trim();
	           	String[] words = line.trim().split(" ");
	           	if(words.length > 3)
	           	{
	           		for(int l=0; l<3;l++)
	           		{
	           			if(words[l].equals("class"))
	           			{
	           				currentClass = words[l+1];
	           			}
	           		}
	           		for(int l=0;l<j;l++)
	           		{
	           			if((words[0].equals(classLlst[l])))	
	           			{
	           				write.println(currentClass + " --> " + words[0]);
	           			}
	           		}
	           	}
	           }
	           
	           write.close();
	           br.close();
	           System.out.println("Output on Output1.txt.");
                   br1.close();
            
            }
              
            catch (IOException e) {
	         
	           e.printStackTrace();
	       }
      }
        catch(Exception e){
            
           e.printStackTrace();
        }
        
    }
}
