/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author Sughan Pandita
 */
public class Televison implements ElectronicDevices{

    private int volume=0;
    @Override
    public void on() {
     System.out.print("TV is ON");
    }

    @Override
    public void off() {
          System.out.print("TV is OFF");
        
    }

    @Override
    public void volumeUp() {
        
        volume++;
          System.out.print("TV voulume up"+volume);
        
    }

    @Override
    public void volumeDown() {
        
       volume--;
          System.out.print("TV voulume down"+volume);
    }
    
    
    
}
