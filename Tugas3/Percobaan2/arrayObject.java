package Percobaan2;

import java.util.Scanner;

import Percobaan1.PersegiPanjang;

public class arrayObject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        for(int i = 0; i < ppArray.length; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan nilai panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan nilai lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i < ppArray.length; i++){
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}
