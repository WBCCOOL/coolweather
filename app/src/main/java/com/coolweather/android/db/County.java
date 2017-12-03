package com.coolweather.android.db;

/**
 * Created by WBC on 2017/12/3.
 */

public class County extends DataSupport{
    private int id;
    private String CountyName;
    private String WeatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public int setid(int id){
        this.id=id;
    }
    
}
