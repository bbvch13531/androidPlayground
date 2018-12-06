package com.example.kyungyoungheo.anotherapp;

import java.io.Serializable;

public class CustomData implements Serializable {
    private static final long serialVersionUID = 987654321L;

    private int mIntAge = 0;
    private int[] mIntArray = new int[10];
    private String mStringName = "hello 10160h30";

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
}
