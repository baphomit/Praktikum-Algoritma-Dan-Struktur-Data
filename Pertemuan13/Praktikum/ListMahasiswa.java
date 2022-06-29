package Praktikum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa {
    List<MahasiswaPrak> mahasiswas = new ArrayList<>();

    public void tambah(MahasiswaPrak... Mahasiswa) {
        mahasiswas.addAll(Arrays.asList(Mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, MahasiswaPrak mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        MahasiswaPrak m = new MahasiswaPrak("201234", "Noureen", "021xx1");
        MahasiswaPrak m1 = new MahasiswaPrak("201235", "Akhleema", "021xx2");
        MahasiswaPrak m2 = new MahasiswaPrak("201236", "Shannum", "021xx3");
        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new MahasiswaPrak("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}