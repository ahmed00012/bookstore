package com.example.nh.books;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView listView;
    ArrayList<book> book1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        book1=new ArrayList<>();

        book1.add(new book(R.drawable.angels, 3.5f,"Angels & Demons ","by Dan Brown"));
        book1.add(new book(R.drawable.blood, 4f,"Bloodline ","by James Rollins"));
        book1.add(new book(R.drawable.humming, 3f,"The Hummingbird's Daughter ","by Luis Alberto Urrea "));
        book1.add(new book(R.drawable.inferno, 3.5f,"Inferno","by Dan Brown"));
        book1.add(new book(R.drawable.nostra, 4.5f,"Terra Nostra ","Carlos Fuentes"));
        book1.add(new book(R.drawable.spirits, 3.5f,"The House of the Spirits ","by Isabel Allende"));
        book1.add(new book(R.drawable.sword, 2.5f,"The Sword Thief  "," by Peter Lerangis"));
        book1.add(new book(R.drawable.solitude, 2f,"One Hundred Years of Solitude ","by Gabriel García Márquez"));
        listView=findViewById(R.id.list1);
        bookadapter adapter=new bookadapter(book1,MainActivity.this);
        listView.setLayoutManager(new LinearLayoutManager(this));
       listView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        listView.setAdapter(adapter);


    }
}
