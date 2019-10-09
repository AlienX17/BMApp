package com.example.bmapp;

class LocationDetails {

    final private String mLocationName;
    final private String mLocationAddress;
    final private String mLocationRating;
    final private int mImageId;

    LocationDetails(String locationName, String locationAddress, String locationRating, int imageId) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationRating = locationRating;
        mImageId = imageId;
    }

    String getLocationName() {
        return mLocationName;
    }

    String getLocationAddress() {
        return mLocationAddress;
    }

    String getLocationRating() {
        return mLocationRating;
    }

    int getImageId() {
        return mImageId;
    }
}
