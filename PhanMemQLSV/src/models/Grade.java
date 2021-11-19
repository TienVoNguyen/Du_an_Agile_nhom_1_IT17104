/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author NTV
 */
public class Grade {
    private int id;
    private String maSV;
    private float tiengAnh,tinHoc,gDTC;        

    public Grade() {
    }

    public Grade(int id,String maSV, float tiengAnh, float tinHoc, float gDTC) {
        this.id = id;
        this.maSV = maSV;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.gDTC = gDTC;
    }

    public Grade(String maSV,float tiengAnh, float tinHoc, float gDTC) {
        this.maSV = maSV;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.gDTC = gDTC;
    }
    
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(float tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public float getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(float tinHoc) {
        this.tinHoc = tinHoc;
    }

    public float getgDTC() {
        return gDTC;
    }

    public void setgDTC(float gDTC) {
        this.gDTC = gDTC;
    }
}
