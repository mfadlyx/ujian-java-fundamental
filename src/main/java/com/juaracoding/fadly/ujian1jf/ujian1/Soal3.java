package com.juaracoding.fadly.ujian1jf.ujian1;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {

        boolean isWeekday = true;
        boolean isWeekend = false;

        double discount = 0.0;
        double price = 0.0;

        System.out.print("Jumlah Tiket : ");
        Scanner scanner = new Scanner(System.in);

        byte totalTicket = scanner.nextByte();
        if (totalTicket > 5){
            if (isWeekday){
                 price = totalTicket*(35000.0-35000.0*0.1);

            }
            else if (isWeekend) {
                 price = totalTicket*(45000.0-45000.0*0.1);
            }
        } else {
            if (isWeekday){
                price = totalTicket*35000.0;
            }
            else if (isWeekend){
                price = totalTicket*45000.0;
            }
        }

        System.out.println("Total Harga (dengan diskon) :" +price);
    }
}
