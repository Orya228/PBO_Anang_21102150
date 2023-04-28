package com.Anang.PBO.Pertemuan3.Unguided;

import java.util.Scanner;

public class Main {
    public static void Menu1(Paket[] Npaket){
        System.out.println("===Menu Pembelian paket Internet Telkomsel===");
        for (int i =0; i< Npaket.length; i++){
            System.out.printf("%d. %s\n", i+1 ,Npaket[i].Nama);
        }
        System.out.println( Npaket.length+1 + ". Keranjang");
        System.out.println( Npaket.length+2 + ". Keluar");
        System.out.println("Pilih menu :");
    }
    public static void Menu2(){
        System.out.println("Pilih opsi : ");
        System.out.println("1. Beli");
        System.out.println("2. Tambahkan ke keranjang dan Kembali");
        System.out.println("3. Kembali");
    }
    public static void Menu3(){
        System.out.println("Pilih opsi : ");
        System.out.println("1. Beli paket");
        System.out.println("2. Hapus paket");
        System.out.println("3. Kembali");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pil;
        int pil2;
        int no;
        boolean kel = false;

        Data isi = new Data();
        Keranjang cekot = new Keranjang();

        do{
            Menu1(isi.Paketan);
            pil = input.nextInt();

            if (pil == isi.Paketan.length+2){
                System.out.println("Keluar!");
                kel = true;
            } else if (pil == isi.Paketan.length+1) {
                do{
                    if (cekot.Harga.size() == 0){
                        System.out.println("Keranjang masih kosong!\n");
                        break;
                    }else {
                        cekot.liatkeranjang();
                        Menu3();
                        pil2 = input.nextInt();
                        if (pil2==1){
                            System.out.println("Terimakasih telah membeli paket " + cekot.Tpaket);
                            System.out.println("Dengan harga Rp. " + cekot.Tharga);
                            kel = true;
                        } else if (pil2 == 2) {
                            cekot.liatkeranjang();
                            System.out.println("Silahkan masukkan nomor paket yang akan di hapus :");
                            no = input.nextInt();
                            System.out.println("Paket " + cekot.Tpaket.get(no-1) + " Telah di hapus!\n");
                            cekot.kurangkeranjang(no);
                        }else {
                            break;
                        }
                    }
                }while (!kel);
            } else {
                System.out.println("\nPaket "+ isi.Paketan[pil-1].Nama);
                isi.Paketan[pil-1].IsiPaket();
                Menu2();
                pil2 = input.nextInt();
                if (pil2 ==1 ){
                    System.out.println("Terima Kasih Telah membeli paket " + isi.Paketan[pil-1].Nama);
                    isi.Paketan[pil-1].IsiPaket();
                    kel = true;
                } else if (pil2 ==2) {
                    System.out.println("Paket " + isi.Paketan[pil-1].Nama + " telah ditambahkan ke Keranjang!\n");
                    cekot.tambahkeranjang(isi.Paketan[pil-1].Nama,isi.Paketan[pil-1].Harga);
                }
            }
        }while (!kel);
    }
}
