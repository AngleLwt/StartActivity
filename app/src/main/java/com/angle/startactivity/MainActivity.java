package com.angle.startactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;

import com.angle.startactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public static final String ACTIVITY_MAIN_MESSAGE="com.angle.startactivity.AppCompatActivity";
    private String enterMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        sendMessage();
    }

    private void sendMessage() {
        binding.activityMainEtEnter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
              enterMessage=editable.toString();
            }
        });
        binding.activityMainEtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Send messge to ohterActivity
                startActivity(new Intent(MainActivity.this,OtherActivity.class).putExtra( ACTIVITY_MAIN_MESSAGE, enterMessage));
            }
        });

    }
}
