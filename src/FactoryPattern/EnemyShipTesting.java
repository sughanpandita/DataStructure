/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Sughan Pandita
 */
import java.util.Scanner;
public class EnemyShipTesting {
    public static void main(String[] args){
        
        
       EnemyShipFactory shipFactory=new EnemyShipFactory();
       EnemyShip theEnemy=null;
       Scanner userInput=new Scanner(System.in);
        System.out.println("what type of ship?(U/R/B)");
       if(userInput.hasNext()){
           
           String typeOfShip=userInput.nextLine();
           theEnemy=shipFactory.makeEnemyShip(typeOfShip);
       }
       
       if(theEnemy!=null){
           
           doStuffEnemy(theEnemy);
       }else{
           
           System.out.println("Enter correct ship next time");
       }
       
      /* EnemyShip ufoship=new UFOEnemyShip();
       Scanner userInput=new Scanner(System.in);
       String enemyShipOption="";
       System.out.println("what type of ship?(U/R)");
       if(userInput.hasNext()){
           
           enemyShipOption=userInput.nextLine();
       }
       
       if(enemyShipOption.equals("U")){
           
           theEnemy=new UFOEnemyShip();
       }
          
       else if(enemyShipOption.equals("R")){
                  theEnemy=new RocketEnemyShip();
        }*/
        
        
    }
    
    public static void doStuffEnemy(EnemyShip anEnemyShip){
        
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
        
    }
    
}
