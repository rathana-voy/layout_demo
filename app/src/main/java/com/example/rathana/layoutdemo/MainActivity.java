package com.example.rathana.layoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView scrollTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollTextView= (TextView) findViewById(R.id.scroll_text_view);
        String text= getResources().getString(R.string.scroll_text);
        Log.d("text",text);
        scrollTextView.setText(text);
        scrollTextView.setMovementMethod(new ScrollingMovementMethod());
    }
}
