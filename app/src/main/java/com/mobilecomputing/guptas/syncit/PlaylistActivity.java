package com.mobilecomputing.guptas.syncit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView listview = findViewById(R.id.list_item);

        ArrayList<String> items = new ArrayList<>();
        items.add("Saurabh");
        items.add("Gupta");
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        items.add("Saurabh");
        items.add("Gupta");
        items.add("Saurabh");
        items.add("Gupta");
        items.add("Saurabh");
        items.add("Gupta");
        items.add("Saurabh");
        items.add("Gupta");
        items.add("Saurabh");
        items.add("Gupta");
        items.add("Saurabh");
        items.add("Gupta");
        items.add("Saurabh");
        items.add("Gupta");
        items.add("Saurabh");
        items.add("Gupta");
        listview.setAdapter(itemsAdapter);



    }
}
