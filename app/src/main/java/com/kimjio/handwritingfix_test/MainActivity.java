package com.kimjio.handwritingfix_test;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.EditText;

import com.kimjio.handwritingfix.HandwritingHelper;

public class MainActivity extends WearableActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = findViewById(R.id.text);
        new HandwritingHelper().attachToTextView(text);

        // Enables Always-on
        setAmbientEnabled();
    }
}
