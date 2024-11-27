/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong2.b11hinhtron;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class HinhTron {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ban kinh : ");
        float bankinh=sc.nextFloat();
        float dientich= (float) ((Math.PI)*(Math.pow(bankinh,2)));
        float chuvi= (float) (2*bankinh*Math.PI);
        System.out.println("Dien tich hinh tron la: "+dientich);
        System.out.println("Chu vi hinh tron la: "+chuvi);
    }
}
