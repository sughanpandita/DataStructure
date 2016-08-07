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
import java.util.ArrayList;
import java.util.List;
public class PlayWithRemote {
    
    public static void main(String args[]){
        
        ElectronicDevices newDevices=TVRemote.getDevices();
        
        TurnTVON onCommand=new TurnTVON(newDevices);
        
        DeviceButton onPressed=new DeviceButton(onCommand);
        
        onPressed.Press();
        
        TurnTVOFF offCommand=new TurnTVOFF(newDevices);
        
        DeviceButton offPressed=new DeviceButton(offCommand);
        
        offPressed.Press();
        
    }
    
}
