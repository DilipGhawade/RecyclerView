package com.example.delete.recyclerview;

/**
 * Created by Delete on 2/7/2017.
 */

public class DataProvider {

    public DataProvider(int img_res,String f_name,String l_name)
    {
        this.setImg_res(img_res);
        this.setF_name(f_name);
        this.setL_name(l_name);
    }

    private int img_res;
    private String f_name,l_name;

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }
}
