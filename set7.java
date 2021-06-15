package com.company;
class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double SurfaceArea(){
        return  (2*Math.PI*radius*radius + 2*radius*Math.PI*height);
    }
    public  double volume(){
        return Math.PI* radius *   radius  *  height;
    }
}
public class set7 {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.setHeight(12);
        System.out.println(cyl.getHeight());
        cyl.setRadius(9);
        System.out.println(cyl.getRadius());
        double s = cyl.SurfaceArea();
        System.out.println(s);
        double v = cyl.volume();
        System.out.println(v);

        }
}
