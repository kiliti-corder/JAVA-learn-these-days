package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-01-9:04 PM
 */
public class CircleTest01 {
    private float R;

    public void setR(float R) {
       this.R = R;
    }

    public float getR() {
        return R;
    }

    public float Area(float R){
       float CircleArea = (float) (R * R * 3.14);
        return CircleArea;
    }


    public static void main(String[] args){
        CircleTest01 circleTest01 = new CircleTest01();
        System.out.println("给出圆的半径为3.2,则可知圆的面积如下:");
        float RealCircleArea = circleTest01.Area(3.2f);
        System.out.println(RealCircleArea);

    }
}
