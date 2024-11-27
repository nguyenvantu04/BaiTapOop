/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong3.b13laodong;

/**
 *
 * @author WIN10
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("nhap thong tin cua LDPT");
        LaoDongPhoThong ldpt = new LaoDongPhoThong();
        ldpt.nhapThongTin();
        System.out.println("thong tin cua LDPT: " + ldpt.inThongTin());
        System.out.println("nhap thong tin cua ki su");
        KiSu kisu = new KiSu();
        kisu.nhapThongTin();
        System.out.println("thong tin cua ki su: " + kisu.inThongTin());
    }
}
