/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//////////////////////DFS USING UTILITY PACKAGE LINKEDLIST
package datastructure;
import java.io.*;
import java.util.*;

/**
 *
 * @author Sughan Pandita
 */
public class GraphDFS {
    
    private int V;
    
    private LinkedList<Integer> []arr;
    //constructor
    GraphDFS(int v){
        
        V=v;
        arr=new LinkedList[v];
        
        for (int i=0;i<v;++i){
            
            arr[i]=new LinkedList();
            
        }
        
    }
    //Functon to add new edge into graph
    void addEdges(int v,int E){
        
      arr[v].add(E);
        
  }
    //function that is used by DFS
    void workDfs(int v,boolean visited[]){
        //Mark current node visited and print
        visited[v]=true;
        System.out.println(""+v);
        //Recursive call for all the vertices adjacent to this vertex
        Iterator<Integer> i=arr[v].iterator();
        while(i.hasNext()){
            int n=i.next();
            if(!visited[n]){
                workDfs(n,visited);
                
            }
            
            
        }
        
        
    }
    //function that do DFS traversal
    void DFS(int v){
        
        //marks intially all the node not visited
        boolean visited[]=new boolean[V];
        
        
      //workDFS(v,visited) answer 2-0-1-3
       // Call the recursive helper function to print DFS traversal
        // starting from all vertices one by one
        for (int i=0; i<V; ++i)
            if (visited[i] == false)
                workDfs(i, visited);// answer 0-1-2-3
        
    }
    
    
    public static void main (String args[]){
        GraphDFS gdfs=new GraphDFS(4);
        
        gdfs.addEdges(0, 1);//false  0->1->2/f/t                 0123
        gdfs.addEdges(0, 2);//false  1->2/t
        gdfs.addEdges(1, 2);//false  2->0->3/f/t
        gdfs.addEdges(2, 0);//false  3->3
        gdfs.addEdges(2, 3);
        gdfs.addEdges(3, 3);
       
        System.out.println("Following is DFS traveral");
        gdfs.DFS(2);
        
        
        
    }
    
    
    
}
