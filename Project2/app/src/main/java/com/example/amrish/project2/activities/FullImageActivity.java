package com.example.amrish.project2.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.amrish.project2.R;
import com.example.amrish.project2.utilities.ImageListUtils;

/**
 * Activity which shows the full-sized image.
 */
public class FullImageActivity extends Activity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Creating an image view
        imageView = new ImageView(getApplicationContext());
        //imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

        //position of the image clicked. Retriving it from the intent which called this activity.
        final int imagePosition = getIntent().getExtras().getInt(ImageListUtils.Constants.INTENT_EXTRA_IMAGE_SELECTED_POSITION_INT);

        //Set the image resource (drawable ID). It gets the particular image id from the list which was clicked
        //Not all of them
        imageView.setImageResource(ImageListUtils.getImageListData(imagePosition).getId());
        imageView.setBackgroundColor(Color.BLACK);

        //Landscape used to display the image in full-size(better display purpose)
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //Register the on click listener for opening the website
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creating the intent for viewing the webiste in the browser
                Intent onClickIntent = new Intent(Intent.ACTION_VIEW);

                //Uri data for the website is set after finding the image which was selected
                onClickIntent.setData(Uri.parse(ImageListUtils.getImageListData(imagePosition).getUrl()));
                startActivity(onClickIntent);

            }
        });

        //No layout file is present. Image view is created above.
        setContentView(imageView);

    }
}