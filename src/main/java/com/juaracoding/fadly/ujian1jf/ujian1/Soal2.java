package com.juaracoding.fadly.ujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        System.out.print("Masukkan nama film : ");
        Scanner scan = new Scanner(System.in);

        String movieNames = scan.next();
        System.out.print("Nama film dalam huruf besar: "+ movieNames.toUpperCase());

    }
}
