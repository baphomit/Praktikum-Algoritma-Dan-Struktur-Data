package TugasNo2;
import java.util.Scanner;

public class QueueMainTugasNo2 {
    public static void menu(){
        System.out.println("\nPilih Menu ");
        System.out.println(" 1. Antrian baru\n 2. Antrian Keluar\n 3. Cek Antrian Terdepan\n 4. Cek Semua Antrian\n 5. Cek Antrian Paling Belekang\n 6. Cari index Mahasiswa dengan Nim\n 7. Cek data mahasiswa berdasarkan antrian\n 8. Hapus Antrian\n 0. Exit");
        System.out.println("-----------------------------------");
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try (Scanner sd = new Scanner(System.in)) {
                try (Scanner sb = new Scanner(System.in)) {
                    System.out.print("Masukkan kapasitas queue : ");
                    int jumlah = sc.nextInt();
                    QueueTugasNo2 antri = new QueueTugasNo2(jumlah);
                    
                    int pilih;
                    do{
                        menu();
                        pilih = sc.nextInt();
                        sc.nextLine();
                        
                        switch(pilih){
                            case 1:
                                
                                System.out.print("Nim Mahasiswa\t: ");
                                String nim = sc.nextLine();
                                System.out.print("Nama Mahasiswa\t: ");
                                String nama = sc.nextLine();
                                System.out.print("Absen Mahasiswa\t: ");
                                int absen = sd.nextInt();
                                System.out.print("IPK Mahasiswa\t: ");
                                double ipk = sb.nextDouble();
                                MahasiswaTugasNo2 nb = new MahasiswaTugasNo2(nim, nama, absen, ipk);
                                sc.nextLine();
                                antri.enqueue(nb);
                                break;
                            case 2:
                                MahasiswaTugasNo2 data = antri.dequeue();
                                if(!"".equals(data.nim) && !"".equals(data.nama) &&!"".equals(data.absen) && data.ipk !=0){
                                    System.out.println("Antrian yang keluar : " + data.nim+ " "+ data.nama+" "+ data.absen+" "+data.ipk);
                            }
                                break;
                            case 3:
                                antri.peek();
                                break;
                            case 4:
                                antri.print();
                                break;
                            case 5:
                                antri.peekRear();
                                break;
                            case 6:
                                System.out.print("Masukkan nim Mahasiswa\t\t:");
                                String nimm = sc.nextLine();
                                antri.peekPosition(nimm);
                                break;
                            case 7:
                                System.out.print("Masukkan indeks Antrian yang akan dicek\t:");
                                int posisi = sc.nextInt();
                                antri.printMahasiswa(posisi);
                                break;
                            case 8:
                                antri.clear();
                                break;
                        }
                    }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
                }
            }
        }
    }
}