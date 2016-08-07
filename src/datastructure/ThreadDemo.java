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
public class ThreadDemo implements Runnable {
    
    public void run()
            
    {
        for (int i=1;i<10;i++)
        {
            System.out.println("Run By:"+Thread.currentThread().getName());
            
            
        }
        
        try{
            
            
            Thread.sleep(1000);
            
            
            
        }
        
        catch(InterruptedException e){
            
         } 
    }
    
}

 class Democlass{
     public static void main(String args[]){
     ThreadDemo td=new ThreadDemo();
     Thread t=new Thread(td);
     
       t.setName("lucy");
 
     Thread t1=new Thread(td);
        t1.setName("Hello");
     Thread t2=new Thread(td);
      t2.setName("Butter");
      t.start();;
      t1.start();
      t2.start();
     
     }
    
    
}
