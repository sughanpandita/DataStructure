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
public class TurnVOLDOWN implements Command{
    
     ElectronicDevices theDevice;
     
     public TurnVOLDOWN( ElectronicDevices newDevice){
         theDevice=newDevice;
     }
    @Override
    public void execute() {
        
        theDevice.volumeDown();
    }
    
}
