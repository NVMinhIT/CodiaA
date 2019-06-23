package com.example.anhminh.demo_unittest_mvvm.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.anhminh.demo_unittest_mvvm.Interface.LoginResultCallBack;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory{

    LoginResultCallBack loginResultCallBack;
    public LoginViewModelFactory(LoginResultCallBack loginResultCallBack){

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginResultCallBack);
    }
}