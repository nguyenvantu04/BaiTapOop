/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong3.b13laodong;

/**
 *
 * @author WIN10
 */
import java.util.Scanner;

public class KiSu extends NguoiLaoDong {
	 protected double luongCoBan;
	    protected double heSoLuong;
	    protected int soNgayCong;

	    public KiSu() {
	        super();
	    }

	    public KiSu(double luongCoBan, double heSoLuong, int soNgayCong) {
	        this.luongCoBan = luongCoBan;
	        this.heSoLuong = heSoLuong;
	        this.soNgayCong = soNgayCong;
	    }

	    public KiSu(double luongCoBan, double heSoLuong, int soNgayCong, String hoTen, String diaChi, String loaiLD) {
	        super(hoTen, diaChi, loaiLD);
	        this.luongCoBan = luongCoBan;
	        this.heSoLuong = heSoLuong;
	        this.soNgayCong = soNgayCong;
	    }
	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	        super.nhapThongTin();
	        System.out.printf("nhap luong co ban: "); luongCoBan = sc.nextDouble();
	        System.out.printf("nhap he so luong: "); heSoLuong = sc.nextDouble();
	        System.out.printf("nhap so ngay cong: "); soNgayCong = sc.nextInt();
	    }

	    @Override
	    public double tinhLuong() {
	        double thuong;
	        if(soNgayCong <= 15) thuong = 500000;
	        else if(soNgayCong > 15 && soNgayCong < 25) thuong = 1000000;
	        else thuong = 2000000;
	        return luongCoBan * heSoLuong + thuong;
	    }
	    public String inThongTin(){
	        return super.inThongTin() + " ,so ngay cong=" + soNgayCong 
	                + " ,luong co ban=" + luongCoBan + " ,he so luong=" + heSoLuong;
	    }
	}
