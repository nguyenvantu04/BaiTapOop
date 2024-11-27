/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong3.b12sinhvien;

/**
 *
 * @author WIN10
 */
import java.util.Scanner;

public abstract class Nguoi {
	 protected String hoTen;
	    protected String diaChi;
	    protected String loaiSV;

	    public Nguoi() {
	    }

	    public Nguoi(String hoTen, String diaChi, String loaiSV) {
	        this.hoTen = hoTen;
	        this.diaChi = diaChi;
	        this.loaiSV = loaiSV;
	    }
	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	        System.out.printf("nhap ho ten: "); hoTen = sc.nextLine();
	        System.out.printf("nhap dia chi: "); diaChi = sc.nextLine();
	        System.out.printf("nhap loai SV: "); loaiSV = sc.nextLine();
	    }
	    public abstract float tinhDiem();
	    public String inThongTin(){
	        return "ho ten=" + hoTen + " ,dia chi=" + diaChi 
	                +" ,loai SV=" + loaiSV + " ,diem tong ket=" + tinhDiem();
	    }
	}