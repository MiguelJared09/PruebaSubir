package com.miguel.testback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import com.miguel.testback.databinding.ActivityMain2Binding;

public class MainActivity2 extends Activity {

    private TextView mTextView;
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }

    public void act3(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==event.KEYCODE_BACK){
            login();
        }
        return super.onKeyDown(keyCode, event);
    }

    void login(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        onCreate(new Bundle());
    }
}