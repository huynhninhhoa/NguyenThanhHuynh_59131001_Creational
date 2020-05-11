/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import static BaiTap3.ShapeType.circle;
import static BaiTap3.ShapeType.rectangle;
import static BaiTap3.ShapeType.triangle;

/**
 *
 * @author Administrator
 */
public class ShapeFactory extends Shape{

    
    public ShapeFactory() {
    }

    public Shape createShape(ShapeType shapeType){
        if(shapeType == circle)
            return Circle.createInstance();
        else if(shapeType == rectangle)
            return Rectangle.createInstance();
        else if(shapeType == triangle)
            return Triangle.createInstance();
        else
            return null;
    }

    @Override
    public String draw() {
        return toString();
    }
    
}
