/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong3.b14congnhan;

/**
 *
 * @author WIN10
 */
public class Test {
    public static void main(String[] args) {
	        CNKSP cnksp = new CNKSP();
	        System.out.println("nhap CNKSP");
	        cnksp.nhapThongTin();
	        System.out.println("nhan CNTCN");
	        CNTCN cntcn = new CNTCN();
	        cntcn.nhapThongTin();
	        System.out.println("CNKSP: " + cnksp.toString());
	        System.out.println("CNTCN: " + cntcn.toString());
	    }
}
