package com.amit_sh.movietitles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class ListOfTitles extends AppCompatActivity {

    private List<movie_model> movies = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_titles);
        RecyclerView recyclerView = findViewById(R.id.movies_rv_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadMovies();

        recyclerView.setAdapter(new MoviesViewAdapter(movies, this));
    }

    private void loadMovies() {
        movie_model movie1 = new movie_model();
        movie_model movie2 = new movie_model();

        movie1.setName("Avengers - Infinity war");
        movie2.setName("Jurassic World - Fallen Kingdom");


        movie1.setImageResourceId(R.drawable.infinity_war_image);
        movie2.setImageResourceId(R.drawable.jurassic_world_fallen_kingdom);

        movie1.setOverview("Now that Earth has put its mark on the universe through the Avengers, all superheroes, including ones from other parts of the Galaxy, must join forces to stop the powerful Thanos from taking all the infinity stones and destroying the universe one planet at a time.");
        movie2.setOverview("Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again");

    }
}
