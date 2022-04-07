package Percobaan;
import java.util.Scanner;

public class MahasiswaMainSequential {
    public static void main(String[] args, PencarianMahasiswaSequential PencarianMahasiswaSequential, PencarianMahasiswaSequential data){
        try (Scanner s = new Scanner(System.in)) {
            try (Scanner sl = new Scanner(System.in)) {
                PencarianMahasiswaSequential = new PencarianMahasiswaSequential();
                int jumMhs = 5;

                System.out.println("-------------------------------------------------------");
                System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil :");
                for(int i = 0; i < jumMhs; i++){
                    System.out.println("-------------------------");
                    System.out.print("NIM\t: ");
                    int nim = s.nextInt();
                    System.out.print("Nama\t: ");
                    String nama = sl.nextLine();
                    System.out.print("Umur\t: ");
                    int umur = s.nextInt();
                    System.out.print("IPK\t: ");
                    double ipk = s.nextDouble();

                    Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
                    data.tambah(m);
                }
            }

            System.out.println("-------------------------------------------------------");
            System.out.println("Data keseluruhan Mahasiswa : ");
            data.tampil();

            System.out.println("____________________________________________");
            System.out.println("____________________________________________");
            System.out.println("Pencarian Data : ");
            System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
            System.out.print("NIM : ");
            int cari = s.nextInt();
            System.out.println("menggunakan Sequential Search");
            int posisi = data.FindSearch(cari);

            data.Tampilposisi(cari, posisi);

            data.TampilData(cari, posisi);
        }
    }
}