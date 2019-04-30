package com.example.cis298_wild_weather;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final int REQUEST_PERMISSION =  1;
    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        _getLocation();
    }

    public void _getLocation(){

        if (ActivityCompat.checkSelfPermission(Context.Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(Context.Manifest.permission.
                        ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(new String[] {Manifest.permission.ACCESS_FINE_LOCATION)
                    ,REQUEST_PERMISSION);
                return;
          }

        Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        if((location != null){
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            Log.d("Main", String.valueOf(latitude));
            Log.d("Main", String.valueOf(longitude));
          }

        }

           @Override
           public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
        @NonNull, int[] grantResults){
            super.onRequestPermissionResult(requestCode, permissions, grantResults);
            switch(requestCode){
                case (REQUEST_PERMISSION) :{
                    _getLocation();
                    break;
                }
            }
        }
          @Override
          protected void onResume(){
            super.onResume();
        }

        }




/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextField = findViewById(R.id.queryET);
        ImageButton backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go back and destroy the ChangeCityController
                finish();
            }
        });

        // Buttons can have a listener for clicks.
        // EditTexts can have listeners for keyboard presses like hitting the enter key.
        editTextField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                String newCity = editTextField.getText().toString();
                Intent newCityIntent = new Intent(MainActivity.this, MainActivity.class);

                // Adds what was entered in the EditText as an extra to the intent.
                newCityIntent.putExtra("City", newCity);

                // We started this activity for a result, so now we are setting the result.
                setResult(Activity.RESULT_OK, newCityIntent);

                // This destroys the ChangeCityController.
                finish();
                return true;
            }
        });

    }
    */

}
