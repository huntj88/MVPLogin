package com.example.james.mvplogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements LoginView{

    private EditText username;
    private EditText password;
    private LoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        loginPresenter = new LoginPresenter(this,new LoginService());

    }

    public void tryLogin(View v)
    {
        loginPresenter.handleLogin();
    }

    @Override
    public String getUsername() {
        return username.getText().toString();
    }

    @Override
    public String getPassword() {
        return password.getText().toString();
    }

    @Override
    public void checkLogin() {

    }

    @Override
    public void displayError(int resId) {
        Log.d("error",getString(resId));
    }

    @Override
    public void loginSuccess() {
        Log.d("yay","yay");
    }
}
