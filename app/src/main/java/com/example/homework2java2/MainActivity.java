package com.example.homework2java2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        createList();
    }

    private void createList() {
        for (int i = 0; i < 15; i++) {
            list.add(new Model("Заголовок", "Описание", 0, System.currentTimeMillis()));
        }
        list.add(new Model("Конец", "Описание", 0, System.currentTimeMillis()));
    }

    private void init(){
        recyclerView = findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.addItems(list);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}