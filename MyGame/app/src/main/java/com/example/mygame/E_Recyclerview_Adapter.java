package com.example.mygame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class E_Recyclerview_Adapter extends RecyclerView.Adapter<E_Recyclerview_Adapter.MyviewHolder> {
    Context context;
    ArrayList<Elmas1> ElmasModel;
    public E_Recyclerview_Adapter(Context context, ArrayList<Elmas1> ElmasModel) {
        this.context=context;
        this.ElmasModel=ElmasModel;

    }

    @NonNull
    @Override
    public E_Recyclerview_Adapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);

        return new E_Recyclerview_Adapter.MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull E_Recyclerview_Adapter.MyviewHolder holder, int position) {
        holder.textView1.setText(ElmasModel.get(position).getElmasname());
        holder.textView2.setText(ElmasModel.get(position).getElmastl());

    }

    @Override
    public int getItemCount() {
        return ElmasModel.size();
    }
    public static class MyviewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView1,textView2;


        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
           // imageView = itemView.findViewById(R.id.)
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);

        }
    }
}
