package com.example.amrish.project2.activities;

import android.app.ListActivity;
import android.os.Bundle;

import com.example.amrish.project2.adaptors.DealersListAdaptor;
import com.example.amrish.project2.utilities.ImageListUtils;

/**
 * Activity responsible for displaing the list of dealers with name and address.
 */
public class DealerListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Creating the adaptor for list view
        DealersListAdaptor dealerAdpator = new DealersListAdaptor(this,
                getIntent().getExtras().getInt(ImageListUtils.Constants.INTENT_EXTRA_IMAGE_SELECTED_POSITION_INT));

        //registering the adaptor
        getListView().setAdapter(dealerAdpator);


    }
}
