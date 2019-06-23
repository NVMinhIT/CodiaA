package com.example.anhminh.demo_unittest_mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.anhminh.demo_unittest_mvvm.Interface.LoginResultCallBack;
import com.example.anhminh.demo_unittest_mvvm.ViewModel.LoginViewModel;
import com.example.anhminh.demo_unittest_mvvm.ViewModel.LoginViewModelFactory;

public class MainActivity extends AppCompatActivity implements LoginResultCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainBinding.setViewModel(ViewModelProviders.of(this,new LoginViewModelFactory(this))
                .get(LoginViewModel.class));

    }

    @Override
    public void onLoginSucess(String message) {
        Toast.makeText(this,"Đăng nhập thành công",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoginFail(String message) {
        Toast.makeText(this,"Đăng nhập thất bại",Toast.LENGTH_LONG).show();
    }
}
