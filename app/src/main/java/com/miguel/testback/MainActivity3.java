package com.miguel.testback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.miguel.testback.databinding.ActivityMain3Binding;

public class MainActivity3 extends Activity {

    private TextView mTextView;
    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }

    public void act4(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        onCreate(new Bundle());
    }
}