package com.example.amrish.project2.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.amrish.project2.utilities.ImageListUtils;
import com.example.amrish.project2.adaptors.ImageTextAdaptor;
import com.example.amrish.project2.R;

/**
 * The app starts from here
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting the grid view from the layout
        GridView gridview = (GridView) findViewById(R.id.gridView);

        //Setting the adpator for the grid-view
        gridview.setAdapter(new ImageTextAdaptor(this));

        //Registering Context menu for the grid view
        registerForContextMenu(gridview);

        // setting the on item click listener for the grid view(short click)
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                //Creation of explicit intent to the FullImageActivity
                final Intent fullImageActivity = new Intent(MainActivity.this, FullImageActivity.class);

                //Setting the position clicked in the extras
                fullImageActivity.putExtra(ImageListUtils.Constants.INTENT_EXTRA_IMAGE_SELECTED_POSITION_INT,
                        position);

                //starting the activity
                startActivity(fullImageActivity);

            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //inflating the context menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.image_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        //starting different activities based on context item selected
        switch (item.getItemId()) {

            //Activity for viewing full image is started
            case R.id.context_view:

                //Creation of the explicit intent
                Intent fullImageActivity = new Intent(MainActivity.this, FullImageActivity.class);

                //passing the position of the image selected
                fullImageActivity.putExtra(ImageListUtils.Constants.INTENT_EXTRA_IMAGE_SELECTED_POSITION_INT,
                        info.position);
                Toast.makeText(getApplicationContext(),""+info.id,Toast.LENGTH_SHORT).show();
                startActivity(fullImageActivity);
                return true;

            //Activity for website of the car is started
            case R.id.context_website:

                //Creation of the implicit intent
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW);

                //Uri data for the website is set after finding the image which was selected
                websiteIntent.setData(Uri.parse(ImageListUtils.getImageListData(info.position).getUrl()));
                startActivity(websiteIntent);
                return true;

            //Activity for viewing dealers list is started
            case R.id.context_dealers:
                Intent dealerIntent = new Intent(MainActivity.this, DealerListActivity.class);

                //passing the position of the image selected
                dealerIntent.putExtra(ImageListUtils.Constants.INTENT_EXTRA_IMAGE_SELECTED_POSITION_INT,
                        info.position);
                startActivity(dealerIntent);
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
}