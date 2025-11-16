package com.example.prgrm1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView TextBoxId;
    Button Click;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextBoxId = (TextView) findViewById(R.id.textid1);
        Click = (Button) findViewById(R.id.button);

        Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextBoxId.setText("We are 5th semester students ready to attend classes :D");
            }
        });
    }
}