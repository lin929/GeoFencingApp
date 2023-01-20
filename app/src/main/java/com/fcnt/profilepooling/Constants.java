package com.fcnt.profilepooling;

import com.google.android.gms.maps.model.LatLng;

/**
 * Constants used in this sample.
 */

class Constants {

    private Constants() {
    }

    private static final String PACKAGE_NAME = "com.fcnt.profilepooling";

    static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    private static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    //FCNT company lacation
    static LatLng AREA_INFORMATION = new LatLng(35.5049618, 139.4518098);
    static long AREA_RADIUS = 1000; //1km

}
