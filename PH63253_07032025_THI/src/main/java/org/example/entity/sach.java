package org.example.entity;

public class sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private float gia;

    public sach(String maSach, String tenSach, String tacGia, int namXuatBan, float gia) {
        if(maSach == null || maSach.trim().equals(maSach)){
           throw new IllegalArgumentException("ma sach trung nhau !");
        }
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.gia = gia;
    }
}
