package com.project.moviecatalogue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMovie;
    private ArrayList<Movie> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovie = (RecyclerView)findViewById(R.id.rvofmovie);
        rvMovie.setHasFixedSize(true);


        list = new ArrayList<>();
        list.addAll(DataMovie.getListData());
        showRecyclerList();
    }

    private void showRecyclerList()
    {
        rvMovie.setLayoutManager(new LinearLayoutManager(this));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(this);
        listMovieAdapter.setListMovie(list);
        rvMovie.setAdapter(listMovieAdapter);
    }
}
