package No3;
public class mainMahasiswa {
    public static void main(String[] args) {
        mahasiswa[] mhs = new mahasiswa[3];

        for (int i=0; i<mhs.length; i++) {
            mhs[i] = new mahasiswa();
            System.out.println("Masukkan data Mahasiswa ke-" + (i+1));
            mhs[i].input();
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<mhs.length; i++) {
            System.out.println("Data Mahasisswa ke-" + (i+1));
            mhs[i].tampil();
        }
    }
}