package com.juaracoding.fadly.ujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] movieNames = new String[5];

        System.out.println("Daftar film bioskop");

        for (int i = 0; i < movieNames.length; i++) {
            System.out.print("Masukkan nama film "+ (i+1)+ ": ");
            movieNames[i] = scanner.nextLine();
        }

        System.out.println("Film yang ingin ditonton:");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println((i + 1)+ ". " + movieNames[i]);
        }

    }
}