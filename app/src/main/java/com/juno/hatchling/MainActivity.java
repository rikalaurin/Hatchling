package com.juno.hatchling;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.juno.hatchling.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
//    private Button bHatchID;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;

        final Button bHatchID = binding.hatchIdButton;
        bHatchID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                b.setText("MAC 00:00:00");
            }
        });
    }
}