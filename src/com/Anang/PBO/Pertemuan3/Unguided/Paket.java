package com.Anang.PBO.Pertemuan3.Unguided;

public class Paket {
    String Nama;
    int Harga;
    String Benefit;

    public Paket(String Nama, int Harga, String Benefit){
        this.Nama = Nama;
        this.Benefit = Benefit;
        this.Harga = Harga;
    }

    public void IsiPaket(){
        System.out.println("Nama Paket : " + Nama);
        System.out.println("Benefit : " + Benefit);
        System.out.println("Harga  : " + Harga);
        System.out.println();
    }
}
