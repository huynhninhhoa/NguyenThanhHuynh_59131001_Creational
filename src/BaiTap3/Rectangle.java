/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Administrator
 */
public class Rectangle extends Shape{

    private static Rectangle rectangle;
    
    protected Rectangle() {
    }
    
    public static Rectangle createInstance(){
        if(rectangle == null)
            rectangle = new Rectangle();
        return rectangle;
    }
    
    @Override
    public String draw() {
        brush = brush + "Cọ vẽ";
        paper = paper + "Giấy vẽ";
        frame = frame + "Khuông hình chữ nhật";
        return "Chuẩn bị: " +brush + ", " + paper + ", " + frame + "\nBắt đầu vẽ hình chữ nhật\n";
    }
    
    
    
}
