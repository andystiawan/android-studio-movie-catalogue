package com.project.moviecatalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Movie getMovie = getIntent().getParcelableExtra("film");
        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView waktu = (TextView)findViewById(R.id.time_content);


        Glide.with(this).load(getMovie.getPhoto())
                .apply(new RequestOptions().override(500, 700)).into(gamabar);
        name.setText(getMovie.getName());
        deskripsi.setText(getMovie.getDeskripsi());
        waktu.setText(getMovie.getWaktu());

        Log.i("photo", getMovie.getPhoto());
        Log.i("deskripsi", getMovie.getDeskripsi());
    }
}
