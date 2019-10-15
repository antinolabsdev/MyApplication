package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private Context  ctx ;
    private List<String>  list;


    public Adapter(Context applicationContext, List<String> listFinal) {
        this.ctx  = applicationContext;
        this.list  = listFinal;
    }

    class MyViewHolder    extends RecyclerView.ViewHolder{
        TextView tvPhone;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPhone  = itemView.findViewById(R.id.tv_habit);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_menu , parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvPhone.setText(list.get(position));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
