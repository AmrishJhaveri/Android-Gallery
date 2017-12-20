package com.example.amrish.project2.adaptors;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amrish.project2.utilities.ImageListUtils;
import com.example.amrish.project2.R;

/**
 * Adapter for displaying Image and Text in the grid
 */
public class ImageTextAdaptor extends BaseAdapter {

    private Context mContext;

    public ImageTextAdaptor(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return ImageListUtils.getImageListDataLength();
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
    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;

        if (convertView == null) {

            //Get the Layout inflater
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //inflate the XML layout file
            grid = inflater.inflate(R.layout.grid_image_text_single, null);

            //get the elements from the View
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView) grid.findViewById(R.id.grid_image);

            //Using BitmapFactory to set the options of sample-sizing to some factor
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 2;
            //options.inJustDecodeBounds = true;

            //BitmapFactory.decodeResource(mContext.getResources(), ImageListUtils.getImageListData(position).getId(), options);

            //options.inSampleSize = calculateInSampleSize(options, 125, 125);

            //options.inJustDecodeBounds = false;

            //Using Bitmap for resizing the thumbnails, so has to reduce the memory usages
            imageView.setImageBitmap(BitmapFactory.decodeResource(mContext.getResources(),
                    ImageListUtils.getImageListData(position).getId(), options));

            //Set the image resource by fetching it from the appropriate image
            //imageView.setImageResource(ImageListUtils.getImageListData(position).getId());

            //Set the name text
            textView.setText(ImageListUtils.getImageListData(position).getName());

        } else {
            grid = convertView;
        }


        return grid;
    }

    /*public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight
                    && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }*/

}