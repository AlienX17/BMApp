package com.example.bmapp;

public class LocationDetails {

    // todo: Make this fields final if they are not to change after the object is created.
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

    // todo: the name of this getter should be getImageId
    int getmImageId(){
        return mImageId;
    }
}
