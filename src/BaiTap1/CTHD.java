/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Administrator
 */
public class CTHD {
    
    String maSanPham;
    String tenSanPham;
    int soLuong;
    double donGia;
    float chietKhau;

    public CTHD() {
    }

    public CTHD(String maSanPham, String tenSanPham, int soLuong, double donGia, float chietKhau) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", donGia=" + donGia + " VND" +", chietKhau=" + chietKhau * 100 + "%" + '}';
    }
     
}
