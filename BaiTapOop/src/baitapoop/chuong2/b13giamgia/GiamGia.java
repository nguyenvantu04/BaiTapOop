/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong2.b13giamgia;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class GiamGia {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao gia san pham : ");
        float gia= sc.nextFloat();
        System.out.println("nhap vao phan tram giam gia(%)");
        int phantram=sc.nextInt();
        float giamoi=gia-gia*phantram/100;
        System.out.println("gia sau khi giam "+phantram+"% la : "+giamoi);
    }
}
