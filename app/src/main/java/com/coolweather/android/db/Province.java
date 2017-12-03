package com.coolweather.android.db;

/**
 * Created by WBC on 2017/12/3.
 */

public class Province extends DataSupport
{
    private int id;
    private String provinceName;
    private int provinceCode;
    public int grtId(){
return id;
    }
    public void setId(int id){
        this.id=id;
    }
    private String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String proviceName){
    this.provinceName=provinceName;
    }
    public int getprovinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}