package com.kencorp.example.spinnerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner liste;
    private TextView competition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        competition = findViewById(R.id.competition);

        liste = findViewById(R.id.spinner);

        ArrayList<String> listCompetition = new ArrayList<String>();

        listCompetition.add("Football");
        listCompetition.add("Volleyball");
        listCompetition.add("Basketball");
        listCompetition.add("Baseball");
        listCompetition.add("Judo");
        listCompetition.add("Kung Fu");

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,listCompetition);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        liste.setAdapter(adapter);

        liste.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String text = parent.getSelectedItem().toString();

                competition.setText(text);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
