package com.example.atelier3;

import android.os. Bundle;
import androidx.appcompat.app. AppCompatActivity;
import androidx.recyclerview.widget. LinearLayoutManager;
import
        androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PaysAdapter paysAdapter;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Ppays> paysList = new ArrayList<>();
        paysList.add(new Ppays("Palestine", "AL-Quds"));
        paysList.add(new Ppays("Maroc", "Rabat"));
        paysList.add(new Ppays("Algeria", "Algeria"));
        paysList.add(new Ppays("Egypt", "Cairo"));
        paysList.add(new Ppays("Qatar", "Doha"));
        paysAdapter = new PaysAdapter(paysList);
        recyclerView.setAdapter(paysAdapter);
    }}