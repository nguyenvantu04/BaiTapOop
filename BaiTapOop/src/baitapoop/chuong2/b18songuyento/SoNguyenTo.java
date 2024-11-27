/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong2.b18songuyento;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class SoNguyenTo {
    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập vào một số nguyên: ");
	        int n = sc.nextInt();

	        // Kiểm tra số nguyên tố
	        if (n <= 1) {
	            System.out.println("Đây không phải là số nguyên tố.");
	        } else {
	            boolean laNguyenTo = true;
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) {
	                    laNguyenTo = false;
	                    break;
	                }
	            }

	            if (laNguyenTo) {
	                System.out.println("Đây là số nguyên tố.");
	            } else {
	                System.out.println("Đây không phải là số nguyên tố.");
	            }
	        }
	       
	    }
}
