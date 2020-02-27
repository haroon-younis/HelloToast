package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: onCreate method is called");

        mShowCount = (TextView) findViewById(R.id.show_count);

        // Restore the state.
        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt("count");
            mShowCount.setText(String.valueOf(mCount));
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");

        outState.putInt("count", mCount);
    }

    public void showToast(View view) {
        Log.d(TAG, "showToast: "); // logger message

        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view) {
        Log.d(TAG, "countUp: First Method Call");

        mCount++;

        if(mShowCount != null) {
            Log.d(TAG, "countUp: Set text to num");
            mShowCount.setText(Integer.toString(mCount));

            Log.d(TAG, "countUp: Change Background and Text Colour");
            mShowCount.setBackgroundColor(Color.BLUE); // change color to blue
            mShowCount.setTextColor(Color.WHITE);
        }

        view.setBackgroundColor(Color.GREEN);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }
}
