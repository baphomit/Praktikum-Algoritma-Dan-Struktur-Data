package No2;
import java.util.Scanner;

public class mainTanah2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah tanah : ");
        int n = sc.nextInt();
        jbTanah2[] tnArray = new jbTanah2[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            tnArray[i] = new jbTanah2();
            System.out.println("Tanah " + (i + 1));
            System.out.print("Panjang : ");
            tnArray[i].panjang = sc.nextInt();
            System.out.print("Lebar : ");
            tnArray[i].lebar = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Luas Tanah " + (i + 1) + ": " + tnArray[i].luasTanah());
        }
        System.out.println();
        int y = 0;
        int luas[] = new int[n];
        for (int i = 0; i < n; i++) {
            luas[i] = tnArray[i].luasTanah();
        }
        y = tnArray[0].tanahTerluas(luas);
        System.out.println("Tanah terluas : Tanah " + (y + 1));
    }
}