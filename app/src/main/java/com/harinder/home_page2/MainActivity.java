package com.harinder.home_page2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void home(View view)
 {
   Intent i= new Intent(this,snackbar.class);
     startActivity(i);
 }

public void intents (View view)
  {
      Intent intent=new Intent(this,intents.class);
      startActivity(intent);
  }
}
