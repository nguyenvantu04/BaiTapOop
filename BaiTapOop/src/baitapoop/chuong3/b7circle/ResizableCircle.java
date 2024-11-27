/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong3.b7circle;

/**
 *
 * @author WIN10
 */
import java.util.Scanner;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle() {
    }

    public ResizableCircle(double radius) {
        super(radius);
    }
    public void nhap(){
        super.nhap();
    }
    @Override
    public void resize(int percent) {
        radius = radius * percent / 100;
    }
    
    public String inThongTin(){
        return "ban kinh=" + radius + " ,dien tich=" + getPerimeter() + " ,chu vi=" + getArea();
    }
}