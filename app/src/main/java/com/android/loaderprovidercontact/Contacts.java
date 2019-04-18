package com.android.loaderprovidercontact;

public class Contacts {
    private String mTen;
    private String mSdt;

    public Contacts(){

    }
    public Contacts(String mTen, String mSdt) {
        this.mTen = mTen;
        this.mSdt = mSdt;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public String getmSdt() {
        return mSdt;
    }

    public void setmSdt(String mSdt) {
        this.mSdt = mSdt;
    }
}
