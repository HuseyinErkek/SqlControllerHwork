package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {
        ArrayList<Elmas1> ElmasModel = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setUpElmas();
        E_Recyclerview_Adapter adapter = new E_Recyclerview_Adapter(this,ElmasModel);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private void setUpElmas (){
    String [] elmasnames = getResources().getStringArray(R.array.Elmasname);
    String [] elmastl = getResources().getStringArray(R.array.Elmastl);

    for (int i = 0; i<elmasnames.length; i++){
        ElmasModel.add(new Elmas1(elmasnames[i],elmastl));


    }
    }
}