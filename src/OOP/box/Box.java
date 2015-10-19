/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author User
 */
public class Box {
    private double width;
    private double length;
    private double height;
    public double getLength() {
        return length;
    }
    public void setLength(double l) {
        length = l;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double w) {
        width = w;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double h) {
        height = h;
    }
    public double area() {
        return length*width;
    }
    public double volume() {
        return area() * height;
    }
    public double weight(double r) {
        return volume() * r;
    }
}
