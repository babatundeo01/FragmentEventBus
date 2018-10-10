package com.example.consultants.fragmenteventbus;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {

    private BlankFragment fragmentOne;
    private BlankFragment2 fragmentTwo;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentOne = new BlankFragment();
        transaction = getSupportFragmentManager().beginTransaction().add(R.id.container1, fragmentOne);
        transaction.commit();

        fragmentTwo = new BlankFragment2();
        transaction = getSupportFragmentManager().beginTransaction().add(R.id.container2, fragmentTwo);
        transaction.commit();
    }
}
