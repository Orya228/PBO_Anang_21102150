package com.Anang.PBO.Pertemuan4.Unguided;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Inisialisasi variable main
        boolean kel = false;
        int pill, pil2;
        String baru;

        Scanner input = new Scanner(System.in);

        // Inisialisasi nilai dari setiap objek
        Peliharaan hewan1 = new Kucing("Goteng", "Anggora", "Hitam");
        Peliharaan hewan2 = new Burung("Iru", "Parkit", "Burung Peliharaan");
        Peliharaan hewan3 = new Burung("Ann", "Merpati", "Burung Lomba");

        Peliharaan[] Isi = {hewan1,hewan2,hewan3};

        do{
            System.out.println("==Menu Hewan Peliharaan==");
            System.out.println("1. Liat Hewan Peliharaan");
            System.out.println("2. Ubah data Hewan Peliharaan");
            System.out.println("3. Keluar");
            System.out.println("Pilih menu : ");
            pill = input.nextInt();

            if(pill==1){
                System.out.println("Semua hewan Peliharaan\n");

                for (Peliharaan peliharaan : Isi) {
                    peliharaan.showInfo();
                    peliharaan.bersuara();
                    peliharaan.cara_bergerak();
                    System.out.println();
                }
            } else if (pill==2) {
                System.out.println("Ubah data Hewan\n");
                System.out.println("Pilih data hewan yang akan diubah :");
                for(int i = 0; i < Isi.length; i++){
                    System.out.printf("%d. %s\n", i+1, Isi[i].Nama);
                }
                System.out.println("Pilih :");
                pill = input.nextInt();
                System.out.printf("- %s -\n",Isi[pill-1].Nama);

                System.out.println("1. Ubah Nama");
                System.out.println("2. Ubah Jenis");
                if(pill == 1){
                    System.out.println("3. Ubah Warna");
                }else {
                    System.out.println("3. Ubah Tipe");
                }
                System.out.println("Pilih :");
                pil2 = input.nextInt();

                if(pil2 == 1){
                    System.out.println("Masukkan nama baru : ");
                    input.nextLine();
                    baru = input.nextLine();
                    System.out.printf("Nama %s Diubah menjadi %s\n", Isi[pill-1].Nama, baru);
                    Isi[pill-1].setNama(baru);
                }else if(pil2 == 2){
                    System.out.println("Masukkan jenis baru : ");
                    input.nextLine();
                    baru = input.nextLine();
                    System.out.printf("Jenis %s Diubah menjadi %s\n", Isi[pill-1].Jenis, baru);
                    Isi[pill-1].setJenis(baru);
                }else {
                    if(pill == 1){
                        System.out.println("Masukkan warna baru : ");
                        input.nextLine();
                        baru = input.nextLine();
                        System.out.printf("Warna %s Diubah menjadi %s\n", ((Kucing) Isi[pill-1]).getWarna_rambut(), baru);
                        ((Kucing) Isi[pill-1]).setWarna_rambut(baru);
                    }else {
                        System.out.println("Masukkan tipe baru : ");
                        input.nextLine();
                        baru = input.nextLine();
                        System.out.printf("Tipe %s Diubah menjadi %s\n", ((Burung) Isi[pill-1]).getTipe(), baru);
                        ((Burung) Isi[pill-1]).setTipe(baru);
                    }
                }

            } else if (pill==3) {
                System.out.println("Keluar!");
                kel = true;
            }else {
                System.out.println("input salah");
            }
        }while (!kel);
    }
}
