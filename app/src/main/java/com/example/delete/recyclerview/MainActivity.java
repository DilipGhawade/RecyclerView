package com.example.delete.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] f_name,l_name;

    int[] img_res ={R.drawable.d,R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.d6};
    ArrayList<DataProvider> arrayList=new ArrayList<DataProvider>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        f_name = getResources().getStringArray(R.array.name);
        l_name = getResources().getStringArray(R.array.Surname);

        int i = 0;
        for (String name : f_name) {
            DataProvider dataProvider = new DataProvider(img_res[i], name, l_name[i]);
            arrayList.add(dataProvider);
            i++;
        }
        adapter = new RecyclurView(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }


}
