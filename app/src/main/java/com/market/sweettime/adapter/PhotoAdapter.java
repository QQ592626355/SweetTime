package com.market.sweettime.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.market.sweettime.bean.NewDirectoryBean;

import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {

    List<NewDirectoryBean> list;
    Context context;
    public PhotoAdapter(Context context,List<NewDirectoryBean> list){
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public PhotoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoAdapter.ViewHolder holder, int position) {

    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ViewHolder(View itemView){
            super(itemView);
        }
    }
}
