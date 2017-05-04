package com.example.babarmustafa.favouritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView mtextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextView = (TextView) findViewById(R.id.for_toys_display);
        String[] my_array = Toys_Name.toGetToysName();
        for (String names:my_array) {
            mtextView.append(names + "\n\n\n");
        }
    }
}
