package com.harinder.home_page2;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class snackbar extends AppCompatActivity {

    Snackbar snackbar;
    TextView ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar);
        ts = (TextView) findViewById(R.id.text2);
    }


    public void press(View view) {
        ts.setText("Snackbar Build.");
        snackbar = Snackbar
                .make(view, "Archived", Snackbar.LENGTH_SHORT)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ts.setText("Undo clicked!");
                    }
                });
        snackbar.show();
    }

    public void back(View view) {
        setContentView(R.layout.snackbar);
    }

    public void next(View view) {
        setContentView(R.layout.constraint);
    }
}
