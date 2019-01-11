package com.example.elsa.myapplication.api;

import com.example.elsa.myapplication.model.Movie;
import com.example.elsa.myapplication.model.MovieResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IRetrofit {
    @GET("now_playing?api_key=280af572647b3e8153b144e478ba7a36")
    Call<List<Movie>> getMoviesT();

    @GET("now_playing?api_key=280af572647b3e8153b144e478ba7a36")
    Call<MovieResponse> getMovies();
}
