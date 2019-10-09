package com.example.bmapp;

public class LocationDetails {

    private String mLocationName;
    private String mLocationAddress;
    private String mLocationRating;
    private int mImageId;

    LocationDetails(String locationName, String locationAddress, String locationRating, int imageId){
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationRating = locationRating;
        mImageId = imageId;
    }

    String getLocationName(){
        return mLocationName;
    }

    String getLocationAddress(){
        return mLocationAddress;
    }

    String getLocationRating(){
        return mLocationRating;
    }

    int getmImageId(){
        return mImageId;
    }
}
