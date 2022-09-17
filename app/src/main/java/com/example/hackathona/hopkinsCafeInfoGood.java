package com.example.hackathona;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import com.example.hackathona.databinding.ActivityHopkinsCafeInfoGoodBinding;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class hopkinsCafeInfoGood extends AppCompatActivity {

    private ActivityHopkinsCafeInfoGoodBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHopkinsCafeInfoGoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });




        Date currentTime = Calendar.getInstance().getTime();
        String formattedDate  = DateFormat.getDateInstance(DateFormat.FULL).format(currentTime);
        String second = DateFormat.getDateInstance(DateFormat.SECOND_FIELD).format(currentTime);
        String minute = DateFormat.getDateInstance(DateFormat.MINUTE_FIELD).format(currentTime);
        String hour = DateFormat.getDateInstance(DateFormat.HOUR0_FIELD).format(currentTime);

        ArrayList<String> TimeFactor = new ArrayList<>();
        TimeFactor.add(second);
        TimeFactor.add(minute);
        TimeFactor.add(hour);

        String[] Time2 = formattedDate.split(",");
        for (int i = 0; i < Time2.length; i++) {
            TimeFactor.add(Time2[i]);
        }

    }
}