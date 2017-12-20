package com.example.amrish.project2.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.amrish.project2.utilities.ImageListUtils;
import com.example.amrish.project2.R;

/**
 * Created by Amrish on 03-Oct-17.
 */

/**
 * Adapter for displaying the dealers
 */
public class DealersListAdaptor extends BaseAdapter {

    private Context mContext;

    /**
     * position of the grid clicked
     */
    private int gridPosition;

    public DealersListAdaptor(Context mContext, int gridPosition) {
        this.mContext = mContext;
        this.gridPosition = gridPosition;
    }

    @Override
    public int getCount() {
        return ImageListUtils.getImageListData(gridPosition).getDealers().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;

        if (convertView == null) {

            //Get the Layout inflator
            LayoutInflater inflator = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Inflate the layout xml file
            view = inflator.inflate(R.layout.activity_dealer_list, null);

            //Get the text view elements
            TextView textName = (TextView) view.findViewById(R.id.dealer_name);
            TextView textAddress = (TextView) view.findViewById(R.id.dealer_address);

            //set the text in the elements
            textName.setText((ImageListUtils.getImageListData(gridPosition).getDealers().get(position)).getName());
            textAddress.setText((ImageListUtils.getImageListData(gridPosition).getDealers().get(position)).getAddress());

        } else {
            view = convertView;
        }

        return view;
    }
}