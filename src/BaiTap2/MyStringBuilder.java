/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author phamthu
 */
public class MyStringBuilder 
{
    String str;
    
    protected MyStringBuilder(Buider buider)
    {
        this.str = buider.str;
    }
    @Override
    public String toString() {
        return "MyStringBuilder{" + "str = : " + str + '}';
    }
    public static class Buider
    {
       String str;

        public Buider() 
        {
        }
        public Buider addString(String s)
        {
            this.str = s + str;
            return this;
        }
        public Buider addFloat(float f)
        {
            this.str = f + str;
            return this;
        }
        public Buider addBool(boolean b)
        {
            this.str = b + str;
            return this;
        }
        public MyStringBuilder buider()
        {
            return new MyStringBuilder(this);
        }
  
    }
    
}
