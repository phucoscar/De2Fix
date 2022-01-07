/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Phuc
 */
public class SinhVien implements Serializable{
    private int ma;
    private String ten, diaChi;
    private String dthoai;
    private static int ima = 10000;

    public SinhVien() {
    }

    public SinhVien(String ten, String diaChi, String dthoai) throws TrongException{
        if (ten.isEmpty())
            throw new TrongException();
        this.ma = ima++;
        this.ten = ten;
        this.diaChi = diaChi;
        this.dthoai = dthoai;
    }

    public SinhVien(int ma, String ten, String diaChi, String dthoai) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.dthoai = dthoai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDthoai() {
        return dthoai;
    }

    public void setDthoai(String dthoai) {
        this.dthoai = dthoai;
    }

    public static int getIma() {
        return ima;
    }

    public static void setIma(int ima) {
        SinhVien.ima = ima;
    }
    
    public Object[] toObjects() {
        return new Object[]{
        ma, ten, diaChi, dthoai  
        };
    }
    
    
}
