package Praktikum;

public class MahasiswaPrak {
    String nim;
    String nama;
    String notelp;

    public MahasiswaPrak(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    public String toString() {
        return "mahasiswa{" + "nim= " + nim + ", nama= " + nama + ", notelp= " + notelp + '}';
    }
}