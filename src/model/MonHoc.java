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
public class MonHoc implements Serializable{
    private int ma, tongSoTiet;
    private String ten, loai;
    private static int ima = 100;

    public MonHoc() {
    }
    
    public MonHoc(String ten,int tongSoTiet, String loai) throws TrongException{
        if (ten.isEmpty())
            throw new TrongException();
        this.ma = ima++;
        this.tongSoTiet = tongSoTiet;
        this.ten = ten;
        this.loai = loai;
    }
    public MonHoc(int ma,String ten,int tongSoTiet, String loai) {
        this.ma = ma;
        this.tongSoTiet = tongSoTiet;
        this.ten = ten;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getIma() {
        return ima;
    }

    public static void setIma(int ima) {
        MonHoc.ima = ima;
    }
    
    public Object[] toObjects(){
        return new Object[] {
        ma, ten, tongSoTiet, loai  
        };
    }
    
}
