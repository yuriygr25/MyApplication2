package com.example.yura.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
//import android.view.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = (TextView)findViewById(R.id.textView); // помните, я просил запомнить идентификатор?
        mNameEditText = (EditText) findViewById(R.id.editText);
    }

    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Hello Kitty!!!!");
        } else {
            mHelloTextView.setText("Привет, " + mNameEditText.getText());
        }

    }


    //public void onClick(View view) {
    //}
}
