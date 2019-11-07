package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.EnumMap;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;// middle men b/w the data and recyclerview
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();

        exampleList.add(new ExampleItem(R.drawable.node,"clicked on studio"));
        exampleList.add(new ExampleItem(R.drawable.oner,"clicked on gs"));
        exampleList.add(new ExampleItem(R.drawable.twor,"clicked on udio"));
        exampleList.add(new ExampleItem(R.drawable.threer,"clicked on america"));
        exampleList.add(new ExampleItem(R.drawable.fiver,"clicked on india"));
        exampleList.add(new ExampleItem(R.drawable.sixr,"clicked on ops"));

        //config for recycler view
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleList);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
