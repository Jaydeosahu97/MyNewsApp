package com.jay.my_news_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<NewsData> newsDataArrayList;

    public MyAdapter(Context context, ArrayList<NewsData> newsDataArrayList) {
        this.context = context;
        this.newsDataArrayList = newsDataArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        NewsData newsData = newsDataArrayList.get(i);
        myViewHolder.mTextView.setText(newsData.getHeadlines());

        Picasso.with(context).load(newsData.getImageUrl()).into(myViewHolder.mImageView);
    }

    @Override
    public int getItemCount() {
        return newsDataArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mTextView = itemView.findViewById(R.id.newsHeadlines);
            mImageView = itemView.findViewById(R.id.newsImages);
        }
    }
}
