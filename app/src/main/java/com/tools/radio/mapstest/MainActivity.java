package com.tools.radio.mapstest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.streetView);
        TextView directions = (TextView) findViewById(R.id.Directions);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StreetViewIntent();
            }
        });

        directions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddressIntent();
            }
        });

    }


    public void StreetViewIntent() {
        Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);


    }

    public void AddressIntent() {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=airport,+Chania+Greece");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);



    }
}
