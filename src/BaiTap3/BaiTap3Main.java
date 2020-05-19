/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author phamthu
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // vẽ hình chữ nhật
       ShapeFactory rectangle =new ShapeFactory();
       Shape shape = rectangle.createShape(ShapeType.rectangle);
        System.out.println(shape.draw());
        // vẽ hình tam giác
        ShapeFactory triangle = new ShapeFactory();
        Shape shape1 = triangle.createShape(ShapeType.triangle);
        System.out.println(shape1.draw());
        // vẽ hình tròn
        ShapeFactory cricle = new ShapeFactory();
        Shape shape2 = cricle.createShape(ShapeType.cricle);
        System.out.println(shape2.draw());
        
    }
    
}
