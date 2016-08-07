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
public class DeviceButton {
    Command theCommand;
    public DeviceButton(Command newCommand){
        
        theCommand=newCommand;
    }
    public void Press(){
        
        theCommand.execute();
        
    }
    
}
