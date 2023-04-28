package com.Anang.PBO.Pertemuan2;

import java.util.Scanner;

// 21102150 - Anang Prayogo
public class Unguided1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "Irui228";
        String password = "qw12";

        System.out.println("Masukkan username : ");
        String tmp1 = input.nextLine();
        System.out.println("Masukkan password : ");
        String tmp2 = input.nextLine();

        if(tmp1.equals(username) && tmp2.equals(password)){
            System.out.println("Login berhasil silahkan masuk");
        } else if (tmp1.equals(username) || tmp2.equals(password)) {
            System.out.println("Silahkan login dengan username dan password yang sah!");
        } else {
            System.out.println("Username dan Password anda salah");
        }
    }
}
