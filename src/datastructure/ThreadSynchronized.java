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





class amount{
    
    private int balance  =50;
    
    
    public int getBalance()
    {
        
        
        
        return balance;
    }
    
   public void withdrawal (int amount)
           
   {
       
       amount =amount-balance;
       
   }
    
    
    
    
    
}
public class ThreadSynchronized implements Runnable  {
    
    private amount acct=new amount();
    
    
    
    public static void main(String args[])
    {
        
        
        ThreadSynchronized ts=new ThreadSynchronized();
        Thread th=new Thread(ts);
        Thread th1=new Thread(ts);
        
        th.setName("Filly");
        th1.setName("Killy");
       th.start();
       th1.start();
    }
        
    
    public void run(){
        for(int i=0;i<5;i++)
        {
            
            
            makeWithdrawal(10);
            
            if(acct.getBalance()<0)
        System.out.println("ammount  overdrawn");
        }
        
    }
    
    
    private synchronized void makeWithdrawal(int amt)
            
    {
        if(acct.getBalance()>=amt)
        {
            
            
            System.out.println("going to withdral"+Thread.currentThread().getName());
            
            
            
            try{
                
                
                
                Thread.sleep(500);
            }
           catch(InterruptedException e)
                    {
                        
                        
                    }
            
            
            acct.withdrawal(amt);
            System.out.println(Thread.currentThread().getName()+ " completes the withdrawal");
            
            
        }
        
        else{
            
            System.out.println("Not enough in account for "+ Thread.currentThread().getName()+ " to withdraw " + acct.getBalance());
        }
        
        
        
    }


    
}
   

