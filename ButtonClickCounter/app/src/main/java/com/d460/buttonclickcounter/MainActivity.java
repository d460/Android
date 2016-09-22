package com.d460.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private TextView textView;
    private static final String TAG = "MainActivity";
    private final String TEXT_CONTENTS = "Text Contents";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: in");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textview);
        textView.setText("");
        userInput.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());
        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = userInput.getText().toString();
                result += "\n";
                textView.append(result);
                userInput.setText("");
            }
        };
        button.setOnClickListener(ourOnClickListener);
        Log.d(TAG, "onCreate: Out");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: In");
        super.onDestroy();
        Log.d(TAG, "onDestroy: Out");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: In");
        super.onStop();
        Log.d(TAG, "onStop: Out");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: In");
        super.onStart();
        Log.d(TAG, "onStart: Out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: In");
        super.onPause();
        Log.d(TAG, "onPause: Out");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: In");
        super.onResume();
        Log.d(TAG, "onResume: Out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: In");
        outState.putString(TEXT_CONTENTS, textView.getText().toString());
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: Out");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: In");
        super.onRestoreInstanceState(savedInstanceState);
        //String savedString = savedInstanceState.getString(TEXT_CONTENTS);
        //textView.setText(savedString);
        textView.setText(savedInstanceState.getString(TEXT_CONTENTS));
        Log.d(TAG, "onRestoreInstanceState: Out");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: In");
        super.onRestart();
        Log.d(TAG, "onRestart: Out");
    }
}
