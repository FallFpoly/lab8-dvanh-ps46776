/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("KIEM TRA HAM TINH TOAN");
        System.out.print("Nhap 5 so thuc: ");
        String[] parts = sc.nextLine().split(" ");
        double[] arr = new double[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Double.parseDouble(parts[i]);
        }
        System.out.println("Tong = " + XPoly.sum(arr));
        System.out.println("Nho nhat = " + XPoly.min(arr));
        System.out.println("Lon nhat = " + XPoly.max(arr));
        System.out.println("KIEM TRA HAM CHUYEN DOI");
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        String ketQua = XPoly.toUpperFirstChar(hoTen);
        System.out.println("Sau khi chuyen doi: " + ketQua);
    }
}