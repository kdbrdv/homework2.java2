package com.example.homework2java2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Model> list = new ArrayList<>();

    public void addItems(ArrayList<Model> models){
        this.list = models;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, description, id , date;
        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_title);
            description = itemView.findViewById(R.id.tv_description);
            id = itemView.findViewById(R.id.tv_id);
            date = itemView.findViewById(R.id.tv_date);
        }

        public void onBind(Model model) {
            title.setText(model.getTitle());
            description.setText(model.getDescription());
            id.setText(String.valueOf(getAdapterPosition() + 1));
            date.setText(date(model.getDate()));
        }
    }
    private String date(long time){
        DateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        return date.format(System.currentTimeMillis());
    }
}
