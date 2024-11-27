/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong3.b10hocvien;

/**
 *
 * @author WIN10
 */
import java.util.Scanner;

public abstract class HocVien {
	   protected String hoTen;
	    protected String diaChi;
	    protected String loaiCT;

	    public HocVien() {
	    }

	    public HocVien(String hoTen, String diaChi, String loaiCT) {
	        this.hoTen = hoTen;
	        this.diaChi = diaChi;
	        this.loaiCT = loaiCT;
	    }
	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	        System.out.printf("nhap ho ten: "); hoTen = sc.nextLine();
	        System.out.printf("nhap dia chi: "); diaChi = sc.nextLine();
	        System.out.printf("nhap loai CT: "); loaiCT = sc.nextLine();
	    }
	    public abstract double hocPhi();
	    public String inThongTin(){
	        return "ho ten=" + hoTen + " ,dia chi=" 
	                + diaChi + " ,loai chuong trinh="+loaiCT + " ,hoc phi=" + hocPhi();
	    }
	}