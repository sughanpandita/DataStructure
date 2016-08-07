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
public class TurnTVON implements Command{
    
     ElectronicDevices theDevice;
     
     public TurnTVON( ElectronicDevices newDevice){
         theDevice=newDevice;
     }
    @Override
    public void execute() {
        
        theDevice.on();
    }
    
    
}
