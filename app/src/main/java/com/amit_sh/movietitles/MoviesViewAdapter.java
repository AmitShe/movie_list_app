package com.amit_sh.movietitles;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MoviesViewAdapter extends RecyclerView.Adapter<MoviesViewAdapter.ViewHolder> {

    private final List<movie_model> movies;
    private LayoutInflater mInflater;
//    private ArrayList<movie_model> mDataSource;

    public MoviesViewAdapter(List<movie_model> items, /* OnMovieClickListener listener,*/ Context context) {
//        mDataSource = items;
        movies = items;
//        movieClickListener = listener;
        mInflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_movie, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.onBindViewHolder(movies.get(position));
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final ImageView ivImage;
        public final TextView tvTitle;
        public final TextView tvOverview;

        public ViewHolder(View view) {
            super(view);
            ivImage = view.findViewById(R.id.item_movie_iv);
            tvTitle = view.findViewById(R.id.item_movie_tv_title);
            tvOverview = view.findViewById(R.id.item_movie_tv_overview);
        }

        public void onBindViewHolder(movie_model movieModel) {
            ivImage.setImageResource(movieModel.getImageResourceId());
            tvTitle.setText(movieModel.getName());
            tvOverview.setText(movieModel.getOverview());
        }


    }
}
