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
public class Circle extends Shape{

    private static Circle circle;
    
    protected Circle(){   
    }
    
    public static Circle createInstance(){
        if(circle == null)
            circle = new Circle();
        return circle;
    }

    @Override
    public String draw() {
        brush = brush + "Cọ vẽ";
        paper = paper + "Giấy vẽ";
        frame = frame + "Khuông hình tròn";
        return "Chuẩn bị: " +brush + ", " + paper + ", " + frame + "\nBắt đầu vẽ hình tròn\n";
    }
   
}
