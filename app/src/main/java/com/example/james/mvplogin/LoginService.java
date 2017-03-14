package com.example.james.mvplogin;

/**
 * Created by James on 3/13/2017.
 */

public class LoginService {
    public boolean login(String username, String password) {
        return "james".equals(username) && "bond".equals(password);
    }
}
