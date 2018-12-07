package com.example.kyungyoungheo.anotherapp;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelData implements Parcelable {
    private int mIntAge = 0;
    private int[] mIntArray = new int[10];
    private String mStringName = "hello 10160h30";

    public ParcelData(){
    }

    public ParcelData(Parcel source){
        mIntAge = source.readInt();
        mStringName = source.readString();
    }
    public int getmIntAge(){
        return mIntAge;
    }
    public int[] getmIntArray(){
        return mIntArray;
    }
    public String getmStringName(){
        return mStringName;
    }

    public void setmIntAge(int age){
        mIntAge = age;
    }
    public void setmIntArray(int[] array){
        mIntArray = array;
    }
    public void setmStringName(String name){
        mStringName = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mIntAge);
        dest.writeIntArray(mIntArray);
        dest.writeString(mStringName);
    }

    public static final Creator<ParcelData> CREATOR = new Creator<ParcelData>() {
        @Override
        public ParcelData createFromParcel(Parcel source) {
            return new ParcelData(source);
        }

        @Override
        public ParcelData[] newArray(int size) {
            return new ParcelData[size];
        }
    };
}
