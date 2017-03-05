package com.harinder.home_page2;

import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.data;

public class intents extends AppCompatActivity {

    static final int REQUEST_SELECT_CONTACT = 1;

    static final int REQUEST_IMAGE_CAPTURE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);

    }


    public  void contacts (View view)
    {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_SELECT_CONTACT);
        }


    }


    public void camera (View view)
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
        }
    }

public  void email(View view)
 {
     Intent intent = new Intent(Intent.ACTION_SEND);
     intent.setType("*/*");
     if (intent.resolveActivity(getPackageManager()) != null) {
         startActivity(intent);
     }
 }

    public void settings(View view) {
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public  void calendar (View view)
    {
        Intent intent= new Intent(Intent.ACTION_INSERT )
                .setData(CalendarContract.Events.CONTENT_URI)
                .putExtra(CalendarContract.Events.TITLE,"My title")
                .putExtra(CalendarContract.Events.EVENT_LOCATION,"my location")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, 2)
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, 6);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
