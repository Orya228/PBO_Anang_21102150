package com.Anang.PBO.Pertemuan3.Unguided;

import java.util.ArrayList;

public class Keranjang {
    ArrayList<String> Tpaket = new ArrayList<>();
    ArrayList<Integer> Harga = new ArrayList<>();
    int Tharga;
    public void tambahkeranjang(String paket, int harga){
        this.Tpaket.add(paket);
        this.Harga.add(harga);
    }

    public void liatkeranjang(){
        Tharga = 0;
        System.out.println("Isi keranjang anda :");
        for (int i =0; i < Tpaket.size(); i++){
            System.out.printf("%d. %s = %d\n", i+1 ,Tpaket.get(i), Harga.get(i));
            Tharga = Tharga + Harga.get(i);
        }
        System.out.println("Total Harga = " + Tharga);
        System.out.println();
    }

    public void kurangkeranjang(int no){
        Tpaket.remove(no-1);
        Harga.remove(no-1);
    }
}
