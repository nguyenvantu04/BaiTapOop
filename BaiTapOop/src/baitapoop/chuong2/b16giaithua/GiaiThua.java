/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong2.b16giaithua;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class GiaiThua {
    public int giaithua(int n){
	        if(n==1 || n==0)
	            return 1;
	        else return n*giaithua(n-1);
	    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("nhap vao so n : ");
	        int n=sc.nextInt();
	        GiaiThua giaithua=new GiaiThua();
	        int giaithuatren=giaithua.giaithua(n);
	        System.out.println("giai thua tren "+n+" la : "+giaithuatren);
	    }
}
