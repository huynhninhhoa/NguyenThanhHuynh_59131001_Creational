/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HoaDonHeader {
    
    String MaHD;
    Date ngayBan;
    String tenKH;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String MaHD, Date ngayBan, String tenKH) {
        this.MaHD = MaHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    public String getMaHD() {
        return MaHD;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "MaHD=" + MaHD + ", ngayBan=" + ngayBan + ", tenKH=" + tenKH + '}';
    }    
    
}
