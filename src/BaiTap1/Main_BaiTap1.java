/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Administrator
 */
public class Main_BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        HoaDonHeader hoadonheader = new HoaDonHeader("HD001", new SimpleDateFormat("HH:mm:ss dd-MM-yyyy ").parse("8:10:15 01-01-2020 "), "Nguyen Thành Huynh");
        
        CTHD cthd1 = new CTHD("SP01", "Tivi_24Inch", 1, 5000000, 0.05f);
        CTHD ctdh2 = new CTHD("SP02", "Máy Giặt", 2, 8000000, 0.1f);
        CTHD cthd3 = new CTHD("SP03", "Tủ Lạnh", 2, 1000000, 0.15f);
        
        HoaDon hd = new HoaDon.Builder()
                .addHoaDonHeader(hoadonheader)
                .addCTHD(cthd1)
                .addCTHD(ctdh2)
                .addCTHD(cthd3)
                .build();
        System.out.println(hd.toString());       
        
    }
   
}
