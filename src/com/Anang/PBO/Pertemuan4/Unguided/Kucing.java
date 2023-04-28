package com.Anang.PBO.Pertemuan4.Unguided;

// Membuat kelas anak atau Child Class
public class Kucing extends Peliharaan{
   // Membuat variable private yang hanya bisa digunakan di dalam kelas ini saja
    private String warna_rambut;

    // Mengisi variable objek dengan menggunakan method yang ada di kelas parent dan di tambah dengan variable dari kelas ini
    public Kucing(String Nama, String Jenis, String warna_rambut){
        super(Nama,Jenis);
        this.warna_rambut = warna_rambut;
    }

    public String getWarna_rambut(){
        return warna_rambut;
    }
    public void setWarna_rambut(String warna){
        this.warna_rambut = warna;
    }

    // Meng Override atau menulis ulang isi dari method sebelumnya
    @Override
    public void bersuara() {
        System.out.println("Suara : Meong-meong");
    }

    // Meng Override atau menulis ulang isi dari method sebelumnya
    @Override
    public void cara_bergerak() {
        System.out.println("Berjalan menggunakan kaki");
    }

    // Menampilkan isi dari objek dengan menggunakan method yang ada di kelas parent dan di tambah dengan variable dari kelas ini
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Warna : " + warna_rambut);
    }
}
