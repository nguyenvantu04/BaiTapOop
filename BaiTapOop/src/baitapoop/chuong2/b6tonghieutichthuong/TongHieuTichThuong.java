/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong2.b6tonghieutichthuong;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class TongHieuTichThuong {
    public static void main(String[] Args) {
	  Scanner sc=new Scanner(System.in);
      System.out.println("nhap vao so nguyen a va b : ");
      int a= sc.nextInt();
      int b=sc.nextInt();
      int tong=a+b;
      int hieu=a-b;
      int tich=a*b;
      float thuong=(float)a/b;
      System.out.println("tong 2 so tren la : "+tong);
      System.out.println("hieu 2 so tren la : "+hieu);
      System.out.println("tich 2 so tren la : "+tich);
      System.out.println("thuong 2 so tren la : "+thuong);

  }
}
