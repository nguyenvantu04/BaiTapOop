/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong3.b8geometry;

/**
 *
 * @author WIN10
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("nhap thong tin cua hinh chu nhat");
        Rectangle rectangle = new Rectangle();
        rectangle.nhap();
        
        System.out.println("nhap thong tin cua hinh tam giac");
        Triangle triangle = new Triangle();
        triangle.nhap();
        
        System.out.printf("\ndien tich dinh chu nhat la: " + rectangle.getArea());
        System.out.printf("\nthong tin hinh chu nhat: " + rectangle.toString());
        System.out.printf("\ndien tich dinh tam giac la: " + triangle.getArea());
        System.out.printf("\nthong tin hinh tam giac: " + triangle.toString());
        
        
    }
}
