package com.example.prgrm6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
public class MainActivity2 extends Fragment {
    private Button btnFragmentOne;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_main2, container,
                false);
        TextView textView = view.findViewById(R.id.fragmentonetextview);
        textView.setText("Fragment One");

        btnFragmentOne = view.findViewById(R.id.clickme);
        btnFragmentOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Fragment One",
                        Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}