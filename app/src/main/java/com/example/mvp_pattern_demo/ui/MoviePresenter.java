package com.example.mvp_pattern_demo.ui;

import com.example.mvp_pattern_demo.pojo.DataModel;

public class MoviePresenter {
    MovieView View;

    public MoviePresenter(MovieView view) {
        this.View = view;
    }

    public DataModel GetDataFromDAtaBase() {
        return new DataModel("Dark Shadows", "15-2-2015");
    }

    public void GetMovieNAme() {
        View.OngetMoviewName(GetDataFromDAtaBase().getName());

    }

}
