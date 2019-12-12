package com.example.mvp_pattern_demo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvp_pattern_demo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MovieView {
    TextView textView;
    Button button;
    MoviePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        presenter = new MoviePresenter(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {

            presenter.GetMovieNAme();
        }
    }

    @Override
    public void OngetMoviewName(String MovieName) {
        textView.setText(MovieName);

    }
}
