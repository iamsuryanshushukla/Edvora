package com.example.edvora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EdvoraInterface edvoraInterface;
    RecyclerView recyclerView;
    EdvoraAdapter edvoraAdapter;
    Spinner spinner;
    String[] names = { "All","Products","State","City" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spincompany);

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, names);

        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(ad);

        recyclerView = findViewById(R.id.parent_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        edvoraInterface = EdvoraRetrofit.getRetrofit().create(EdvoraInterface.class);
        Call<List<EdvoraModekl>> call = edvoraInterface.getEdvora();
        call.enqueue(new Callback<List<EdvoraModekl>>() {

            @Override
            public void onResponse(Call<List<EdvoraModekl>> call, Response<List<EdvoraModekl>> response) {
                if (!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, response.code(), Toast.LENGTH_SHORT).show();

                    return;
                }
                List<EdvoraModekl> list = response.body();
                edvoraAdapter = new EdvoraAdapter(list,MainActivity.this);
                recyclerView.setAdapter(edvoraAdapter);

            }

            @Override
            public void onFailure(Call<List<EdvoraModekl>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}