package com.example.delete.recyclerview;

import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Delete on 2/7/2017.
 */

public class RecyclurView extends RecyclerView.Adapter<RecyclurView.RecyclerViewHolder> {

    private ArrayList<DataProvider> arrayList= new ArrayList<DataProvider>();
    public RecyclurView(ArrayList<DataProvider> arrayList)
    {
        this.arrayList=arrayList;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
            RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        DataProvider dataProvider= arrayList.get(position);
        holder.imageView.setImageResource(dataProvider.getImg_res());
        holder.textView1.setText(dataProvider.getF_name());
        holder.textView2.setText(dataProvider.getL_name());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView textView1,textView2;
        public RecyclerViewHolder(View view)
        {
            super(view);

            imageView =(ImageView)view.findViewById(R.id.img);
            textView1=(TextView)view.findViewById(R.id.f_name);
            textView2 = (TextView)view.findViewById(R.id.l_name);

        }
    }



}
