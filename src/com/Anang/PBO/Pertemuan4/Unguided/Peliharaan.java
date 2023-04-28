package com.Anang.PBO.Pertemuan4.Unguided;

// Membuat kelas Induk atau Parent Class
public class Peliharaan {
    // Membuat variable induk kelas
    protected String Nama;
    protected String Jenis;

    // Membuat method untuk mengisi variable objek
    public Peliharaan(String Nama, String Jenis){
        this.Jenis = Jenis;
        this.Nama = Nama;
    }

    public void setNama(String Nama_baru){
        this.Nama = Nama_baru;
    }
    public void setJenis(String Jenis_baru){
        this.Jenis = Jenis_baru;
    }

    // Membuat method untuk menampilkan isi dari variable objek
    public void showInfo(){
        System.out.println("Nama : " + Nama);
        System.out.println("Jenis : " + Jenis);
    }

    // Membuat method untuk menampilkan ciri dari objek
    public void bersuara(){
        System.out.println("Hewan bersuara");
    }

    // Membuat method untuk menampilkan ciri dari objek
    public void cara_bergerak(){
        System.out.println("Hewan bergerak dari satu tempat ke tempat lain");
    }
}
