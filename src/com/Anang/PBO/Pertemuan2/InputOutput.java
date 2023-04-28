package com.Anang.PBO.Pertemuan2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama Anda : ");
        String nama = input.nextLine();
        System.out.println("Masukkan usia Anda : ");
        int usia = input.nextInt();

        System.out.println("Selamat pagi " + nama + "! \n" + usia);
    }
}
