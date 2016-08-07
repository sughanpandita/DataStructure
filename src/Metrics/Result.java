/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sughan Pandita
 */
//NAME :SUGHAN PANDITA   KID-K00365704
 
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Result {

	public static void main(String[] args)
	{
		int count=0;
           
	   String filePath ="C:\\Users\\Sughan Pandita\\Documents\\NetBeansProjects\\DataStructure\\src\\Polymorph1.java";
	   BufferedReader br, br1;
	   String Search = "class";
	   String line = "", currentclass = "";
	   String[] classlist = new String[100];

	   try {
	       br = new BufferedReader(new FileReader(filePath));
	       try {
	       	PrintWriter write = new PrintWriter(new FileWriter("Result.txt",true));
	
	 
	       	write.println(" "); 
	       	           while((line = br.readLine()) != null)
	           {
	           	line.trim();
	               String[] words = line.trim().split(" ");

	               for (int i=0;i<words.length; i++)
	               {
	                 if (words[i].equals(Search))
	                 {
	                   i++;
	                   classlist[count] = words[i];
	                   count++;
	                   i++;
	                   if(words[i].equals("extends")) 
	                   {
	                 
	                   	write.print(words[i-1]);
	                   	i++;
	              
	                   	write.println(" --|> "+ words[i]);
	                   }
	                   
	                   else if(words[i].equals("implements"))	
	                   {
	              
	                   	write.print(words[i-1]);
	              
	                   	write.println(" ..|> "+words[i+1]);
                               
	                   }
                           
                           
                           
                         
	                 }
                        
	               }
	           }
	           
	      
	           int j=0;
	           while(classlist[j]!=null)
	           {
	         
	           	j++;
	           }
	           
	           br1 = new BufferedReader(new FileReader(filePath));
	           while((line = br1.readLine()) != null)
	           {
	           	line.trim();
	           	String[] words = line.trim().split(" ");
	           	if(words.length > 3)
	           	{
	           		for(int i=0; i<3;i++)
	           		{
	           			if(words[i].equals("class"))
	           			{
	           				currentclass = words[i+1];
	           			}
	           		}
	           		for(int i=0;i<j;i++)
	           		{
	           			if((words[0].equals(classlist[i])))	
	           			{
	           				write.println(currentclass + " --> " + words[0]);
	           			}
	           		}
	           	}
	           }
	           
	           write.close();
	           br.close();
	           System.out.println("Output Written succesfully on Result.txt.");;
	       } catch (IOException e) {
	         
	           e.printStackTrace();
	       }
	   } catch (FileNotFoundException e) {
	
	       e.printStackTrace();
	   }

	}

}