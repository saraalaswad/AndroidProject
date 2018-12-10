package com.example.saraalaswad.moviebox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import DetailFragments.BackdropFragment;

public class MovieDetailActivity extends Activity {

    private static final String TAG = MovieDetailActivity.class.getSimpleName();

    public static final String BASE_URL = "https://image.tmdb.org/t/p/w185";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        Intent intent = getIntent();
        Movie mov_intent = (Movie) intent.getSerializableExtra("detail");
        BackdropFragment backdropFragment = (BackdropFragment) getFragmentManager().findFragmentById(R.id.fragment_backdrop);
        backdropFragment.set_backdrop(BASE_URL);
    }
}