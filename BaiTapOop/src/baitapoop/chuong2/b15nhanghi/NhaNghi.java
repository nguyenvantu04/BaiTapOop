/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong2.b15nhanghi;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class NhaNghi {
     public double giamgia(double n,double dongia){
        if(n==1)
            return n*dongia;
        else if(n>1 && n<=4) {
            dongia = dongia - 20 * dongia / 100;
            return n * dongia;
        }
        else if (n > 4 && n <= 10) {
            dongia=dongia-40*dongia/100;
            return n*dongia;
        }
        else {
            dongia=dongia-60*dongia/100;
            return n*dongia;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so ngay : ");
        double songay= sc.nextDouble();
        System.out.println("Nhap vao so tien : ");
        double sotien= sc.nextDouble();
        NhaNghi obj=new NhaNghi();
        double kq=obj.giamgia(songay,sotien);
        System.out.println("so tien phai tra la : "+kq);


    }
}
