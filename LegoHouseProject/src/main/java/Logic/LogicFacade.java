package Logic;

import DB.UserMapper;
import Data.User;

/**
 * 
 * @author Younes
 */
public class LogicFacade {

    public static User login( String username, String password) throws LoginSampleException {
        return UserMapper.loginUser(username, password);
    } 

    public static User createUserCustomer(String username, String password, String email ) throws LoginSampleException, ClassNotFoundException {
        User user = new User(username, password, email, "customer");
        UserMapper.createUser(user);
        return user;
    }
    
    public static User createUserEmployee(String username, String password, String email ) throws LoginSampleException, ClassNotFoundException {
        User user = new User(username, password, email, "employee");
        UserMapper.createUser(user);
        return user;
    }
    

  }
