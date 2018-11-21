package com.amit_sh.movietitles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
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
        movies = new ArrayList<>(10);

        movie_model movie1 = new movie_model();
        movie_model movie2 = new movie_model();
        movie_model movie3 = new movie_model();
        movie_model movie4 = new movie_model();
        movie_model movie5 = new movie_model();
        movie_model movie6 = new movie_model();
        movie_model movie7 = new movie_model();
        movie_model movie8 = new movie_model();
        movie_model movie9 = new movie_model();
        movie_model movie10 = new movie_model();


        movie1.setName("Avengers - Infinity war");
        movie2.setName("Jurassic World - Fallen Kingdom");
        movie3.setName("Avengers - Infinity war");
        movie4.setName("Jurassic World - Fallen Kingdom");
        movie5.setName("Avengers - Infinity war");
        movie6.setName("Jurassic World - Fallen Kingdom");
        movie7.setName("Avengers - Infinity war");
        movie8.setName("Jurassic World - Fallen Kingdom");
        movie9.setName("Avengers - Infinity war");
        movie10.setName("Jurassic World - Fallen Kingdom");


        movie1.setImageResourceId(R.drawable.infinity_war_image);
        movie2.setImageResourceId(R.drawable.jurassic_world_fallen_kingdom);
        movie3.setImageResourceId(R.drawable.infinity_war_image);
        movie4.setImageResourceId(R.drawable.jurassic_world_fallen_kingdom);
        movie5.setImageResourceId(R.drawable.infinity_war_image);
        movie6.setImageResourceId(R.drawable.jurassic_world_fallen_kingdom);
        movie7.setImageResourceId(R.drawable.infinity_war_image);
        movie8.setImageResourceId(R.drawable.jurassic_world_fallen_kingdom);
        movie9.setImageResourceId(R.drawable.infinity_war_image);
        movie10.setImageResourceId(R.drawable.jurassic_world_fallen_kingdom);

        movie1.setOverview("Now that Earth has put its mark on the universe through the Avengers, all superheroes, including ones from other parts of the Galaxy, must join forces to stop the powerful Thanos from taking all the infinity stones and destroying the universe one planet at a time.");
        movie2.setOverview("Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again");
        movie3.setOverview("Now that Earth has put its mark on the universe through the Avengers, all superheroes, including ones from other parts of the Galaxy, must join forces to stop the powerful Thanos from taking all the infinity stones and destroying the universe one planet at a time.");
        movie4.setOverview("Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again");
        movie5.setOverview("Now that Earth has put its mark on the universe through the Avengers, all superheroes, including ones from other parts of the Galaxy, must join forces to stop the powerful Thanos from taking all the infinity stones and destroying the universe one planet at a time.");
        movie6.setOverview("Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again");
        movie7.setOverview("Now that Earth has put its mark on the universe through the Avengers, all superheroes, including ones from other parts of the Galaxy, must join forces to stop the powerful Thanos from taking all the infinity stones and destroying the universe one planet at a time.");
        movie8.setOverview("Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again");
        movie9.setOverview("Now that Earth has put its mark on the universe through the Avengers, all superheroes, including ones from other parts of the Galaxy, must join forces to stop the powerful Thanos from taking all the infinity stones and destroying the universe one planet at a time.");
        movie10.setOverview("Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again");

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);

    }
}
