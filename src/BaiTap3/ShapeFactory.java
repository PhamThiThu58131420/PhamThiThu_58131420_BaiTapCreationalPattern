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
public class ShapeFactory 
{
    public  Shape  createShape(ShapeType shapeType)
    {
        switch(shapeType)
        {
            case rectangle : return  new Rectangle();
            case triangle :return  new Triangle();
            case cricle : return  new Cricle();
        }
        return null;
    }
    
    
}
