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
    private float tiengAnh,tinHoc,gDTC;

    public Grade() {
    }

    public Grade(int id, float tiengAnh, float tinHoc, float gDTC) {
        this.id = id;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.gDTC = gDTC;
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
