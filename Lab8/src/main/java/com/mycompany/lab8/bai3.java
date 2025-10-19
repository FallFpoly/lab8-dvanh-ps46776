/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        String ketQua = XPoly.toUpperFirstChar(hoTen);
        System.out.println("Sau khi chuyen doi: " + ketQua);
    }
}
