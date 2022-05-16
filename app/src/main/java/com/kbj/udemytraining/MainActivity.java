package com.kbj.udemytraining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        Double rate = 0.12;

        //Log.i("amount entered: ", amountEditText.getText().toString());
        Log.i("rate being used: ", rate.toString());

        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);
        ImageView dellImageView = (ImageView) findViewById(R.id.dellImageView);
        ImageView lenovoImageView = (ImageView) findViewById(R.id.lenovoImageView);



        if(dellImageView.getAlpha() == 0.0){
            dellImageView.animate().alpha(1).setDuration(2000);
            lenovoImageView.animate().alpha(0).setDuration(2000);
            Log.i("Alpha", ":" + dellImageView.getAlpha());
            Log.i("Alpha", ":" + lenovoImageView.getAlpha());
        }

        if(lenovoImageView.getAlpha() == 0.0){
            lenovoImageView.animate().alpha(1).setDuration(2000);
            dellImageView.animate().alpha(0).setDuration(2000);
            Log.i("Alpha", ":" + dellImageView.getAlpha());
            Log.i("Alpha", ":" + lenovoImageView.getAlpha());
        }

//        try {
//            Toast.makeText(this, "Converted Amount: " + rate * Integer.parseInt(amountEditText.getText().toString()), Toast.LENGTH_LONG).show();
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//            Toast.makeText(this, "input format error", Toast.LENGTH_LONG).show();
//        }
    }
}