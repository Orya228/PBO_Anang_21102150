package com.Anang.PBO.Pertemuan4.Unguided;

// Membuat kelas anak atau Child Class
public class Burung extends Peliharaan{
    // Membuat variable private yang hanya bisa digunakan di dalam kelas ini saja
    private String tipe;

    // Mengisi variable objek dengan menggunakan method yang ada di kelas parent dan di tambah dengan variable dari kelas ini
    public Burung(String Nama, String Jenis, String tipe){
        super(Nama,Jenis);
        this.tipe = tipe;
    }
    public String getTipe(){
        return tipe;
    }

    public void setTipe(String Tipe_baru){
        this.tipe = Tipe_baru;
    }

    // Meng Override atau menulis ulang isi dari method sebelumnya
    @Override
    public void bersuara() {
        System.out.println("Suara : kwak - kwaak");
    }

    // Meng Override atau menulis ulang isi dari method sebelumnya
    @Override
    public void cara_bergerak() {
        System.out.println("Terbang menggunakan sayap");
    }

    // Menampilkan isi dari objek dengan menggunakan method yang ada di kelas parent dan di tambah dengan variable dari kelas ini
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Tipe burung : " + tipe);
    }
}
