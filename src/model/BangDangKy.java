/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Phuc
 */
public class BangDangKy implements Serializable{
    private int maSV, maMH;
    private String tenSV, tenMH;
//    private List<SinhVien> listSV;
//    private List<MonHoc> listMH;
    String thoiGian;

    public BangDangKy() {
    }

    public BangDangKy(int maSV, int maMH, String tenSV, String tenMH,String thoiGian) {
        this.maSV = maSV;
        this.maMH = maMH;
        this.tenSV = tenSV;
        this.tenMH = tenMH;
        this.thoiGian = thoiGian;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

//    public List<SinhVien> getListSV() {
//        return listSV;
//    }
//
//    public void setListSV(List<SinhVien> listSV) {
//        this.listSV = listSV;
//    }
//
//    public List<MonHoc> getListMH() {
//        return listMH;
//    }
//
//    public void setListMH(List<MonHoc> listMH) {
//        this.listMH = listMH;
//    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    
    
    public Object[] toObjects() {
        return new Object[] {
            maSV, tenSV, maMH, tenMH, thoiGian
        };
    }
}
