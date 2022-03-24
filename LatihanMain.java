package Tugas1;

import java.util.Scanner;
/**
 *
 */
public class LatihanMain {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("----------------- Portal Pemira BEM Tahun 2020 ---------------");
            Latihan lat = new Latihan();
            Latihan[] qwer = new Latihan[lat.jmlhKandidat];
            for (int i = 0; i < lat.jmlhKandidat; i++) {
                qwer[i] = new Latihan();
                System.out.print("Nama Calon Presiden BEM ke- " + (i + 1) + " : ");
                qwer[i].kandidat = sc.nextLine();
            }

            System.out.println("-----------------------------------------------------------------");
            for (int i = 0; i < lat.jmlhKandidat; i++) {
                System.out.print(" Masukkan Jumlah Suara Calon Presiden Bem ke" + (i + 1) + " : ");
                qwer[i].vote = sc.nextInt();
                lat.jumlahVote += qwer[i].vote;
            }

            System.out.println("-----------------------------------------------------------------");
            int hasil = Latihan.hasilPemungutanSwara(lat.jumlahVote,qwer[0].vote, qwer[1].vote, qwer[2].vote, qwer[3].vote);
                System.out.println("Presiden Bem Terpilih Dimenangkan oleh : " + qwer[hasil - 1].kandidat);
        }
    }
}