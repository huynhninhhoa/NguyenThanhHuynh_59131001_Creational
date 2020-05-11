/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;


/**
 *
 * @author Administrator
 */
public class Main_BaiTap2 {
    public static void main(String[] args) {
        MyStringBuilder mystringbuilder = new MyStringBuilder.Builder()
            .addString("Tên: Nguyễn Thành Huynh MSSV: 5913 1001 Điểm: ")
            .addFloat(7.0f)
            .addString("Giới tính: ")
            .addBool(true)
            .build();
        
        System.out.println(mystringbuilder.toString());
    }             
}
