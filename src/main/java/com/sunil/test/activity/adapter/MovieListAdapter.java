package com.sunil.test.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunil.test.R;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MyViewHolder> {
    private  Context mContext;
    public MovieListAdapter(final Context context){
        this.mContext=context;
    }
    @NonNull
    @Override
    public MovieListAdapter.MyViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_movie_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull final MovieListAdapter.MyViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);
        }
    }
}
