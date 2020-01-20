package com.example.homework31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Main_Adapter adapter;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    public void initViews() {
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new Main_Adapter();
        recyclerView.setAdapter(adapter);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

    }


    public void sendinRecyclerView(View view){

        String someText = editText.getText().toString();
        adapter.addText(someText);

    }
}
