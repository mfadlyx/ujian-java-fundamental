package com.juaracoding.fadly.ujian1jf.ujian1;

import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] ticketPrices = new  int[5];

        int totalAmount = 0;

        for (int i = 0; i < ticketPrices.length; i++) {
            System.out.print("Harga tiket film "+ (i+1)+ ": ");
            ticketPrices[i] = scanner.nextInt();
            totalAmount += ticketPrices[i];
        }

        System.out.println("Total harga tiket: " + totalAmount);

    }
}
