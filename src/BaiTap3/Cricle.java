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
public class Cricle  extends Shape
{
    public static Cricle instance;
    protected Cricle()
    {
        
    }
    public static  Cricle instance()
    {
        if(instance == null)
            instance = new Cricle();
        return instance;
    }

    @Override
    public String draw()
    {
        return " vẽ hình tròn";
    }
    
    
}
