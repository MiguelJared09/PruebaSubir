package com.miguel.testback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.miguel.testback.databinding.ActivityMain4Binding;

public class MainActivity4 extends Activity {

    private TextView mTextView;
    private ActivityMain4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }

    public void back2(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
        finish();
    }
}