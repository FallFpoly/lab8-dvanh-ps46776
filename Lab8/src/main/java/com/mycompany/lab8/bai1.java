/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class bai1 {
    public static final double sum(double... x) {
        double tong = 0;
        for (double n : x) {
            tong += n;
        }
        return tong;
    }
    public static void main(String[] args) {
        System.out.println("Tong 1 so: "+sum(5));
        System.out.println("Tong 3 so: "+sum(1.5, 2.5, 3));
        System.out.println("Tong 5 so: "+sum(10, 20, 30, 40, 50));
    }
}
