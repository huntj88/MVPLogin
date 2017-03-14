package com.example.james.mvplogin;

/**
 * Created by James on 3/13/2017.
 */

public interface LoginView {
    void checkLogin();
    void displayError(int resId);
    void loginSuccess();
    String getUsername();
    String getPassword();
}
