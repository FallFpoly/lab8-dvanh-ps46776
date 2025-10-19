/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author dva22
 */
public class XPoly {
    public static final double sum(double... x) {
        double tong = 0;
        for (double n : x) tong += n;
        return tong;
    }
    public static final double min(double... x) {
        double min = x[0];
        for (double n : x) if (n < min) min = n;
        return min;
    }
    public static final double max(double... x) {
        double max = x[0];
        for (double n : x) if (n > max) max = n;
        return max;
    }
     public static final String toUpperFirstChar(String s) {
        String[] words = s.trim().split("\\s+"); 
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                char firstChar = words[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
                words[i] = upperFirstChar + words[i].substring(1);
            }
        }
        return String.join(" ", words);
    }
}
