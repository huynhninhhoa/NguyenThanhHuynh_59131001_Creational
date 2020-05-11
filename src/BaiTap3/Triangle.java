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
public class Triangle extends Shape{

    private static Triangle triangle;
    
    protected Triangle() {
    }
       
    public static Triangle createInstance(){
        if(triangle == null)
            triangle = new Triangle();
        return triangle;
    }
    
    @Override
    public String draw() {
        brush = brush + "Cọ vẽ";
        paper = paper + "Giấy vẽ";
        frame = frame + "Khuông hình tam giác";
        return "Chuẩn bị: " +brush + ", " + paper + ", " + frame + "\nBắt đầu vẽ hình tam giác\n";
    }
    
}
