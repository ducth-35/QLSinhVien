/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import Model.User;
import java.util.List;

/**
 *
 * @author Other
 */
public class UserDAO {
    List<User>list = new ArrayList<>();
    public UserDAO() {
        list.add(new User("admin", "12345", true));
        list.add(new User("admin", "12345", true));
        list.add(new User("admin", "12345", true));
        list.add(new User("admin", "12345", true));
    }

    public boolean checkLogin(String username, String password) {
        for (User user : list) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
}
