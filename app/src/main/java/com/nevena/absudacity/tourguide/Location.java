package com.nevena.absudacity.tourguide;

public class Location {

    static final int DETAIL_NOT_AVAILABLE = -1;

    private int photoId;
    private int titleId;
    private int descriptionId;
    private int addressId;

    public Location(int image, int title, int description, int address) {
        //save local vars
        photoId = image;
        this.titleId = title;
        this.descriptionId = description;
        this.addressId = address;
    }

    // generate getters

    public int getPhotoId() {
        return photoId;
    }

    public int getTitleId() {
        return titleId;
    }

    public int getDescriptionId() {
        return descriptionId;
    }

    public int getAddressId() {
        return addressId;
    }

}
