package com.example.recyclerviewex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<User> users = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        users.add(new User("Amir","coolest guy ever",R.drawable.beard));
        users.add(new User("Reza","best mentor",R.drawable.sia));
        users.add(new User("Matin","coolest guy ever",R.drawable.man));
        users.add(new User("Sia","call an ambulance",R.drawable.sia));
        users.add(new User("Amir","coolest guy ever",R.drawable.beard));
        users.add(new User("Reza","best mentor",R.drawable.sia));
        users.add(new User("Matin","coolest guy ever",R.drawable.man));
        users.add(new User("Sia","call an ambulance",R.drawable.sia));

        recyclerView = findViewById(R.id.rcyl_users);
        Adapter adapter = new Adapter(MainActivity.this, users);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }
}