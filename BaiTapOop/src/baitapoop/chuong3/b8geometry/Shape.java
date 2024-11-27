/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapoop.chuong3.b8geometry;

/**
 *
 * @author WIN10
 */
import java.util.Scanner;

public abstract class Shape {
	 protected String color;

	    public Shape() {
	    }

	    public Shape(String color) {
	        this.color = color;
	    }
	    
	    public void nhap(){
	        Scanner sc = new Scanner(System.in);
	        System.out.printf("nhap mau sac: ");
	        color = sc.nextLine();
	    }
	    public abstract double getArea();

	    @Override
	    public String toString() {
	        return "Shape{" + "color=" + color + '}';
	    }
	    
	}
