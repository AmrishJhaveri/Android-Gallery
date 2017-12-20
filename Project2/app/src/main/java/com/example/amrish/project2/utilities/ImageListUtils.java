package com.example.amrish.project2.utilities;

import com.example.amrish.project2.R;
import com.example.amrish.project2.entities.ImageCellData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amrish on 30-Sep-17.
 */
/**
 * Utility for dealing with images
 */
public class ImageListUtils {

    //The list of all the image data
    private static List<ImageCellData> imageList;

    public final static class Constants {

        /**
         * Constants for the POSITION selected in the grid
         */
        public static String INTENT_EXTRA_IMAGE_SELECTED_POSITION_INT = "position";

    }

    /**
     * Constants for the official website URL of various car manufacturers
     */
    private final static class Urls {

        private static String LAMBORGHINI = "https://www.lamborghini.com/en-en/";
        private static String MASERATI = "http://www.maseratiusa.com/maserati/us/en";
        private static String FERRARI = "https://www.ferrari.com/en-US";
        private static String TESLA = "https://www.tesla.com/";
        private static String PORSCHE = "https://www.porsche.com/usa/";
        private static String ROLLS_ROYCE = "https://www.rolls-roycemotorcars.com/en-GB/home.html";

    }

    /**
     * Constants for the various car manufacturers
     */
    private final static class CarName {
        private static String LAMBORGHINI = "Lamborghini";
        private static String MASERATI = "Maserati";
        private static String FERRARI = "Ferrari";
        private static String TESLA = "Tesla";
        private static String PORSCHE = "Porsche";
        private static String ROLLS_ROYCE = "Rolls Royce";
    }

    /**
     * Constants for the dealers
     */
    private final static class DealerName {
        private static final String LAMBO_DEALER_1 = "Bentley Gold Coast";
        private static final String LAMBO_DEALER_2 = "Greater Chicago Motors";
        private static final String LAMBO_DEALER_3 = "Perillo Downers Grove";

        private static final String MAS_DEALER_1 = "MASERATI OF CHICAGO";
        private static final String MAS_DEALER_2 = "Bentley Gold Coast";
        private static final String MAS_DEALER_3 = "McLaren Chicago Showroom";

        private static final String TESLA_DEALER_1 = "Bentley Gold Coast";
        private static final String TESLA_DEALER_2 = "Greater Chicago Motors";
        private static final String TESLA_DEALER_3 = "Perillo Downers Grove";

        private static final String FER_DEALER_1 = "McLaren Chicago Showroom";
        private static final String FER_DEALER_2 = "Bentley Gold Coast";
        private static final String FER_DEALER_3 = "Greater Chicago Motors";

        private static final String PORSCHE_DEALER_1 = "Bavarian Motors";
        private static final String PORSCHE_DEALER_2 = "Greater Chicago Motors";
        private static final String PORSCHE_DEALER_3 = "Perillo Downers Grove";

        private static final String RR_DEALER_1 = "Bentley Gold Coast";
        private static final String RR_DEALER_2 = "Steve Foley Rolls-Royce";
        private static final String RR_DEALER_3 = "Greater Chicago Motors";

    }

    /**
     * Constants for the addresses of the dealers
     */
    private final static class DealerAddress {

        private static final String LAMBO_DEALER_1 = "834 N Rush St, Chicago, IL 60611";
        private static final String LAMBO_DEALER_2 = "1850 N Elston Ave, Chicago, IL 60642";
        private static final String LAMBO_DEALER_3 = "330 Ogden Ave, Downers Grove, IL 60515";

        private static final String MAS_DEALER_1 = "834 N Rush St, Chicago, IL 60611";
        private static final String MAS_DEALER_2 = "834 N Rush St, Chicago, IL 60611";
        private static final String MAS_DEALER_3 = "645 W Randolph St, Chicago, IL 60661";

        private static final String TESLA_DEALER_1 = "834 N Rush St, Chicago, IL 60611";
        private static final String TESLA_DEALER_2 = "1850 N Elston Ave, Chicago, IL 60642";
        private static final String TESLA_DEALER_3 = "330 Ogden Ave, Downers Grove, IL 60515";

        private static final String FER_DEALER_1 = "645 W Randolph St · (312) 635-6482";
        private static final String FER_DEALER_2 = "834 N Rush St · (312) 280-4848";
        private static final String FER_DEALER_3 = "1850 N Elston Ave · (312) 280-9262";

        private static final String PORSCHE_DEALER_1 = "27 N May St, Chicago, IL 60607";
        private static final String PORSCHE_DEALER_2 = "1850 N Elston Ave, Chicago, IL 60642";
        private static final String PORSCHE_DEALER_3 = "330 Ogden Ave, Downers Grove, IL 60515";

        private static final String RR_DEALER_1 = "834 N Rush St, Chicago, IL 60611";
        private static final String RR_DEALER_2 = "100 Skokie Blvd, Northbrook, IL 60062";
        private static final String RR_DEALER_3 = "1850 N Elston Ave · (312) 280-9262";

    }

    /**
     * Initialize the list of Image Data
     */
    private static void setImageListData() {

        imageList = new ArrayList<>();

        imageList.add((new ImageCellData(R.drawable.lamborghini, Urls.LAMBORGHINI, CarName.LAMBORGHINI))
                .addDealers(new String[]{DealerName.LAMBO_DEALER_1, DealerName.LAMBO_DEALER_2, DealerName.LAMBO_DEALER_3},
                        new String[]{DealerAddress.LAMBO_DEALER_1, DealerAddress.LAMBO_DEALER_2, DealerAddress.LAMBO_DEALER_3}));

        imageList.add((new ImageCellData(R.drawable.maserati, Urls.MASERATI, CarName.MASERATI))
                .addDealers(new String[]{DealerName.MAS_DEALER_1, DealerName.MAS_DEALER_2, DealerName.MAS_DEALER_3},
                        new String[]{DealerAddress.MAS_DEALER_1, DealerAddress.MAS_DEALER_2, DealerAddress.MAS_DEALER_3}));

        imageList.add((new ImageCellData(R.drawable.tesla, Urls.TESLA, CarName.TESLA))
                .addDealers(new String[]{DealerName.TESLA_DEALER_1, DealerName.TESLA_DEALER_2, DealerName.TESLA_DEALER_3},
                        new String[]{DealerAddress.TESLA_DEALER_1, DealerAddress.TESLA_DEALER_2, DealerAddress.TESLA_DEALER_3}));

        imageList.add((new ImageCellData(R.drawable.ferrari, Urls.FERRARI, CarName.FERRARI))
                .addDealers(new String[]{DealerName.FER_DEALER_1, DealerName.FER_DEALER_2, DealerName.FER_DEALER_3},
                        new String[]{DealerAddress.FER_DEALER_1, DealerAddress.FER_DEALER_2, DealerAddress.FER_DEALER_3}));

        imageList.add((new ImageCellData(R.drawable.porsche, Urls.PORSCHE, CarName.PORSCHE))
                .addDealers(new String[]{DealerName.PORSCHE_DEALER_1, DealerName.PORSCHE_DEALER_2, DealerName.PORSCHE_DEALER_3},
                        new String[]{DealerAddress.PORSCHE_DEALER_1, DealerAddress.PORSCHE_DEALER_2, DealerAddress.PORSCHE_DEALER_3}));

        imageList.add((new ImageCellData(R.drawable.rollsroyce, Urls.ROLLS_ROYCE, CarName.ROLLS_ROYCE))
                .addDealers(new String[]{DealerName.RR_DEALER_1, DealerName.RR_DEALER_2, DealerName.RR_DEALER_3},
                        new String[]{DealerAddress.RR_DEALER_1, DealerAddress.RR_DEALER_2, DealerAddress.RR_DEALER_3}));

    }

    /**
     * Get the length of the List of image data
     *
     * @return int
     */
    public static int getImageListDataLength() {

        if (imageList == null) {
            setImageListData();
        }

        return imageList.size();
    }

    /**
     * Get the image object based on the position clicked
     *
     * @param position index of the image clicked in the grid
     * @return ImageCellData
     */
    public static ImageCellData getImageListData(int position) {

        if (imageList == null) {
            setImageListData();
        }

        return imageList.get(position);

    }

    /**
     * private constructor so other classes cant instantiate objects of this class.
     */
    private ImageListUtils() {

    }

}
