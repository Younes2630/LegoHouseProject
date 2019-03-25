/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Younes
 */
public class User {
    
    private String username;
    private String password;
    private String email;
    private String role;
  //private double balance; 

    public User(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
            
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
    
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    
    
    public String getRole() {
        return role;
    }
    
    
    
 }
