package com.example.james.mvplogin;

/**
 * Created by James on 3/13/2017.
 */

public class LoginPresenter {

    private LoginView view;
    private LoginService service;

    public LoginPresenter(LoginView view, LoginService service)
    {
        this.view = view;
        this.service = service;
    }

    public void handleLogin()
    {
        if(view.getUsername().length()<=0)
        {
            view.displayError(R.string.username_empty_error);
        }
        else if(view.getPassword().length()<=0)
        {
            view.displayError(R.string.password_empty_error);
        }
        else if(service.login(view.getUsername(),view.getPassword()))
        {
            view.loginSuccess();
        }
        else
        {
            view.displayError(R.string.invalid_credentials_error);
        }
    }

}
