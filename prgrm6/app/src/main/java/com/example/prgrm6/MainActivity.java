package com.example.prgrm6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    private Button btnFragment1, btnFragment2;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnFragment1 = findViewById(R.id.button1);
        btnFragment2 = findViewById(R.id.button2);
        fragmentManager = getSupportFragmentManager();
        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new MainActivity2();
                fragmentManager.beginTransaction().replace(R.id.framelayout
                        ,fragment).commit();
            }
        });
        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new MainActivity3();
                fragmentManager.beginTransaction().replace(R.id.framelayout
                        ,fragment).commit();
            }
        });
        if(savedInstanceState == null){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new MainActivity2()).commit();
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)
                , (v, insets) -> {

                    Insets systemBars =
                            insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right,
                            systemBars.bottom);
                    return insets;
                });
    }
}