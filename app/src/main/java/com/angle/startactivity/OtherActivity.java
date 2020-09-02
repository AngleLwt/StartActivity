package com.angle.startactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.angle.startactivity.databinding.ActivityOhterBinding;

public class OtherActivity extends AppCompatActivity {

    private ActivityOhterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOhterBinding.inflate(getLayoutInflater(), null, false);
        setContentView(binding.getRoot());
        initView();
    }

    private void initView() {
//        Receive message
        String enterMessage = getIntent().getStringExtra(MainActivity.ACTIVITY_MAIN_MESSAGE);

        if (enterMessage != null) {

            binding.activityOtherTvReceive.setText(enterMessage);

        }
    }
}
