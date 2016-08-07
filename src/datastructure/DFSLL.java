/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.util.*;
import java.io.*;
/**
 *
 * @author Sughan Pandita
 */
// This class is doing work as LinkedList
class Neighbour{
    public int vertexNum;
    public Neighbour next;
    public Neighbour(int vtxnum,Neighbour nxtnbr){
        this.vertexNum=vtxnum;
        this.next=nxtnbr;
    }
    
}


 class Vertex{
     String name;
     Neighbour adjList;
     Vertex(String name,Neighbour neighbour){
         this.name=name;
         this.adjList=neighbour;
     }
     
     
 }
//This is graph class performing action
public class DFSLL {
    
    Vertex[] arr;
    
    public DFSLL(String file)throws FileNotFoundException{
        
        Scanner sc=new Scanner(new File(file));
        String graphType=sc.next();
        boolean undirected=true;
        if(graphType.equals("directed")){
            undirected=false;
            
        }
       arr=new Vertex[sc.nextInt()]; 
       //read vertices
       for (int v=0;v<arr.length;v++){
           arr[v]=new Vertex(sc.next(),null);
           
       }
       //read edges
        while(sc.hasNext()){
        
        //read vertices name and transate in vertex numbers
        int v1=indexForName(sc.next());
        int v2=indexForName(sc.next());
        arr[v1].adjList=new Neighbour(v2, arr[v1].adjList);
        if(undirected){
            arr[v2].adjList=new Neighbour(v1, arr[v2].adjList);
            
        }
    }
    }
    
    int indexForName(String name){
        for(int v=0;v<arr.length;v++){
            
            if(arr[v].name.equals(name)){
                
                return v;
            }
            
        }
        return -1;
    }
}
