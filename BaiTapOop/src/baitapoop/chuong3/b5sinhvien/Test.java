/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong3.b5sinhvien;

/**
 *
 * @author WIN10
 */
public class Test {
    public static void main(String[] args) {
        SinhVien sinhvien = new SinhVien();
        System.out.println("nhap thong tin sinh vien");
        sinhvien.nhap();
        System.out.println("thong tin sinh vien la: " + sinhvien.toString());
    }
}
