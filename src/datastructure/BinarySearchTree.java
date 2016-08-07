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
public class BinarySearchTree {
    
    node root;
    
    public void addNodes(int key,String name){
        
        node newNode=new node(key,name);
        
        if(root==null){
            
            root=newNode;
            
        }
        
        else{
            
            
            node focusNode=root;
            
            node parent;
            
            while(true){
                
                parent=focusNode;
                
                if(key<focusNode.key)
                {
                    focusNode=focusNode.leftChild;
                    
                    if(focusNode==null)
                    {
                        parent.leftChild=newNode;
                        return;
                    }
                    
                    
                }
                
                else{
                    focusNode=focusNode.rightChild;
                    
                    if(focusNode==null){
                        
                        
                        parent.rightChild=newNode;
                        return;
                    }
                    
                    
                }
                
            }
        }
        
        
    }
    
    
    public void inOrder(node focusNode){
    
    if(focusNode!=null){
        
        inOrder(focusNode.leftChild);
        System.out.println(focusNode);
         inOrder(focusNode.rightChild);
        
        
        
    }
    }
     public static void main(String args[])
    {
        BinarySearchTree bs=new BinarySearchTree();
        bs.addNodes(50, "Boss");
         bs.addNodes(25, "hello");
          bs.addNodes(15, "chalo");
           bs.addNodes(30, "dhoom");
            bs.addNodes(65, "sales");
             bs.addNodes(85, "bhoom");
             bs.inOrder(bs.root);
         
        
        
    }
    
}

class node{
    
    int key ;
    String name;
    
    node leftChild;
    node rightChild;
    
    public node(int key,String name){
        
        this.key=key;
        this.name=name;
        
    }
    
    public String toString(){
        
        return name+"has a key"+key;
        
    }
    
    
}
