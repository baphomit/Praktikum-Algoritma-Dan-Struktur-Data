package Tugas.Tugas4;
public class ImplementasiLinkedListQueue {
    String nim, nama;
    int absen;
    double ipk;
    ImplementasiLinkedListQueue next;
    
    ImplementasiLinkedListQueue(String nim, String nama, int absen, double ipk, ImplementasiLinkedListQueue next){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
        this.next = next;
    }
}
