
package Presentation;

import Logic.LoginSampleException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Younes
 */
abstract class Command {
    
    private static HashMap<String, Command> commands;
    
    private static void initCommands(){
        commands = new HashMap<>();
        commands.put("login", new LoginCommand() );
        commands.put("register", new RegisterCustomerCommand() );
    
    
    }
        
        static Command from(HttpServletRequest request){
            String commandName = request.getParameter("command");
            if(commands == null){
                initCommands();
            }
         
            return commands.getOrDefault(commandName, new DefaultCommand() );
        
        }
        
        abstract String execute(HttpServletRequest request, HttpServletResponse response)
                    throws LoginSampleException;
    
    
    
    
}
