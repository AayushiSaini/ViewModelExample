package com.example.viewmodelexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//int num=1;  we dont use int as we declare int in mainview model
TextView textView;
MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.number);
        //view model object we can not create view model object directly we need to use viewmodel provider
        mainViewModel=new ViewModelProvider(this).get(MainViewModel.class);
        textView.setText(""+mainViewModel.num);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainViewModel.num++;
                textView.setText(""+mainViewModel.num);
            }
        });
    }
}