/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong2.b10hinhchunhat;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class HinhChuNha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu dai hinh chu nhat : ");
        int cd = sc.nextInt();
        System.out.println("nhap vao chieu rong hinh chu nhat : ");
        int cr = sc.nextInt();
        int chuvi=(cd+cr)*2;
        int dientich=cd*cr;
        System.out.println("dien tich hinh chu nhat la : "+dientich);
        System.out.println("chu vi hinh chu nhat la : "+chuvi);
    }
}
