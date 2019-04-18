package com.example.retrofitrecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.retrofitrecycle.generator.ServiceGenerator;
import com.example.retrofitrecycle.model.ChuckNorrisQuote;
import com.example.retrofitrecycle.service.ChuckService;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ChuckService chuckService;
    TextView txtData;
    ImageView imgChuck;
    Button btnReload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chuckService = ServiceGenerator.createService(ChuckService.class);
        txtData = (TextView) findViewById(R.id.textView);
        imgChuck = (ImageView) findViewById(R.id.imgChuck);
        btnReload = (Button) findViewById(R.id.btnReload);

        btnReload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reloadData();
            }
        });


        Call<ChuckNorrisQuote> call = chuckService.getQuote();
        call.enqueue(new Callback<ChuckNorrisQuote>() {
            @Override
            public void onResponse(retrofit2.Call<ChuckNorrisQuote> call, Response<ChuckNorrisQuote>
                    response) {
                txtData.setText(response.body().getValue());

                Picasso.with(getApplicationContext()).load(response.body().getIconUrl()).into(imgChuck);
            }

            @Override
            public void onFailure(retrofit2.Call<ChuckNorrisQuote> call, Throwable t) {
                txtData.setText(t.getMessage());
            }
        });
    }
    private void reloadData() {
        Call<ChuckNorrisQuote> call = chuckService.getQuote();
        call.enqueue(new Callback<ChuckNorrisQuote>() {
            @Override
            public void onResponse(retrofit2.Call<ChuckNorrisQuote> call, Response <ChuckNorrisQuote>
                    response) {
                txtData.setText(response.body().getValue());

                Picasso.with(getApplicationContext()).load(response.body().getIconUrl()).into(imgChuck);
            }

            @Override
            public void onFailure(retrofit2.Call<ChuckNorrisQuote> call, Throwable t) {
                txtData.setText(t.getMessage());
            }
        });

    }




}

