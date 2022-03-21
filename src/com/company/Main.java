package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập loại tiền: ");
        String loaiTien = scanner.nextLine();
//
        switch (loaiTien){
            case "vnd":
                System.out.println("nhập số tiền VND: ");
                double VND1 = scanner.nextDouble();
                double USD1 = VND1/23000;
                System.out.println("USD = " + USD1);
                break;
            case "usd":
                System.out.println("nhập số tiền VND: ");
                double USD2 = scanner.nextDouble();
                double VND2 = USD2*23000;
                System.out.println("USD = " + VND2);
                break;
            default:
                System.out.println("chọn vnd hoặc usd thôi");
        }
    }
}
