package com.Anang.PBO.Pertemuan2;

import java.util.Scanner;

// 21102150 - Anang Prayogo
public class Unguided2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nama
        System.out.println("Masukkan nama anda : ");
        String nama = input.nextLine();

        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut");

        // Input gaji dan tunjangan
        System.out.println("Gaji = input bebas");
        int gaji = input.nextInt();
        System.out.println("Tunjangan = input bebas");
        int tunjangan = input.nextInt();
        double pajak = 0.0765;
        System.out.println("Pajak = 7.65%");

        //Perhitungan gaji
        int Gaji_kotor = gaji + tunjangan;
        double Pajak_negara = Gaji_kotor * pajak;
        double Gaji_bersih = Gaji_kotor - Pajak_negara;

        System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + Gaji_bersih);
    }
}
