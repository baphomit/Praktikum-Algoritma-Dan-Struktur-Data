package Percobaan;
import java.util.Scanner;

public class PostFixMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String P,Q;
            System.out.println("Masukkan ekspresi matematika (infix) : ");
            Q = sc.nextLine();
            Q = Q.trim();
            Q = Q + ")";
            
            int total = Q.length();
            PostFix post = new PostFix(total);
            P = post.konversi(Q);
            System.out.println("PostFix : "+ P);
        }
    }
}