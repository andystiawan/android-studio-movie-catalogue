package com.project.moviecatalogue;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.ListViewHolder> {

    public ArrayList<Movie> listMovie;
    private Context context;
    private Activity activity;

    public ListMovieAdapter(Context context) {
        this.context = context;
    }


    public ArrayList<Movie> getListMovie() {
        return listMovie;
    }
    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_item, viewGroup, false);
        ListViewHolder viewHolder = new ListViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        final Movie namafilm = listMovie.get(position);
        Glide.with(context)
                .load(namafilm.getPhoto())
                .apply(new RequestOptions().override(100, 100))
                .into(holder.imgPhoto);
        holder.tvName.setText(namafilm.getName());
        holder.tvDeskripsi.setText(namafilm.getDeskripsi());
        holder.tvwaktu.setText(namafilm.getWaktu());
        holder.movie = namafilm;


    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }
    public void startactivity(Intent intent){

    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        ImageView imgPhoto;
        TextView tvName, tvwaktu, tvDeskripsi;
        Button btndetail;
        Movie movie;


        public ListViewHolder( View itemView) {
            super(itemView);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView) itemView.findViewById(R.id.tv_item_name);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.tv_item_deskripsi);
            tvwaktu = (TextView) itemView.findViewById(R.id.tv_item_waktu);
            btndetail = (Button) itemView.findViewById(R.id.btn_set_detail);
            btndetail.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailMovie.class);
            intent.putExtra("film", movie);
            context.startActivity(intent);
        }
    }

}
