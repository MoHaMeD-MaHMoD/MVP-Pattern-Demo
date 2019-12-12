package com.example.mvp_pattern_demo.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp_pattern_demo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MovieView {

    MoviePresenter presenter;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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
