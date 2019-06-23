package com.example.anhminh.demo_unittest_mvvm.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.example.anhminh.demo_unittest_mvvm.Interface.LoginResultCallBack;
import com.example.anhminh.demo_unittest_mvvm.Model.User;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginResultCallBack loginResultCallBack;

    public LoginViewModel(LoginResultCallBack loginResultCallBack) {
        this.loginResultCallBack = loginResultCallBack;
        this.user = new User("","");

    }

    // create method get Username and set user

    public TextWatcher getEmailTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setEmail(s.toString());

            }
        };
    }
    // create create get password and set
    public TextWatcher getPasswordTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setPassword(s.toString());

            }
        };
    }


    public void onLoginClicked(View view){
        if(user.isValidate()){
            loginResultCallBack.onLoginSucess("Sucess !");

        }else {
            loginResultCallBack.onLoginFail("Lỗi, Please try !");

        }

    }
}
