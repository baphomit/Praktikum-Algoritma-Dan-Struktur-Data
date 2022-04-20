Nama    : Dimitri Abdullah

Kelas   : TI-1F

NIM     : 2141720249

# **PRAKTIKUM ALGORITMA DAN STRUKTUR DATA**
## **JOBSHEET 7**
## **STACK**

### **7.2 Praktikum 1**

### *7.2.1 Langkah-langkah Percobaan*

*Class "Pakaian"*

~~~java
package Percobaan;
public class Pakaian {
    String jenis, warna, merk, ukuran;
    double harga;

    Pakaian (String jenis, String warna, String merk, String ukuran, double harga){
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }
}
~~~

*Class "Stack"*

~~~java
package Percobaan;
public class Stack {
    int size;
    int top;
    Pakaian data[];

    public Stack(int size){
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Pakaian pkn){
        if (!IsFull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if (!IsEmpty()){
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println("");
    }

    public void clear(){
        if (!IsEmpty()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }
}
~~~

*Main Class "StackMain"*

~~~java
package Percobaan;
import java.util.Scanner;

public class StackMain {
    public static void main(String[] args){
        Stack stk = new Stack(5);
        try (Scanner sc = new Scanner(System.in)) {
            char pilih;
            do {
                System.out.print("Jenis: ");
                String jenis = sc.nextLine();
                System.out.print("Warna: ");
                String warna = sc.nextLine();
                System.out.print("Merk: ");
                String merk = sc.nextLine();
                System.out.print("Ukuran: ");
                String ukuran = sc.nextLine();
                System.out.print("Harga: ");
                double harga = sc.nextDouble();

                Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                pilih = sc.next().charAt(0);
                sc.nextLine();
                stk.push(p);
            }while (pilih == 'y');
        }
       
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
    }
}
~~~

### *7.2.3 Pertanyaan*

1. Berapa banyak data pakaian yang dapat ditampung di dalam stack? Tunjukkan potongan kode program untuk mendukung jawaban Anda tersebut!

    *Banyak data pakaian yang dapat ditampung didalam stack berjumlah 5 elemen, adapun potongan kodenya terdapat pada Main class "stackMain" berikut ini :*

    ~~~java
    Stack stk = new Stack(5);
    ~~~

2. Perhatikan class StackMain, pada saat memanggil fungsi push, parameter yang dikirimkan adalah p. Data apa yang tersimpan pada variabel p tersebut?

    *Data yang tersimpan pada variabel p adalah data-data yang dimasukkan melalui scanner.*

3. Apakah fungsi penggunaan do-while yang terdapat pada class StackMain?

    *Berfungsi untuk melakukan perulangan agar nantinya user dapat menginputkan data yang meliputi judul, nama pengarang, tahun terbit, jumlah halaman, dan harga. Maka setelah melakukan penginputan, user akan diberi pilihan untuk menambahkan data baru atau tidak, jika "y" maka user akan diminta untuk menginputkan data data lagi, dan jika user memilih "n" maka program akan berhenti.*

4. Modifikasi kode program pada class StackMain sehingga pengguna dapat memilih operasioperasi pada stack (push, pop, peek, atau print) melalui pilihan menu program dengan memanfaatkan kondisi IF-ELSE atau SWITCH-CASE!

    ~~~java
    package Percobaan;
    import java.util.Scanner;

    public class StackMainEdit {
        public static void main(String[] args) {
            Stack stk = new Stack(5);
        
            Scanner sc = new Scanner(System.in);
            Scanner sd = new Scanner(System.in);
        
            char pilih;
            do{
                System.out.println("------------------------------------");
                System.out.println("             PILIHAN MENU           ");
                System.out.println("------------------------------------");
                System.out.println(" 1. Push\n 2. Pop\n 3. Peek\n 4. Print\n");
                int pilihan;
                System.out.print("Pilih Menu (masukkan angka 1-4): ");
                pilihan = sd.nextInt();
            
                switch (pilihan){
                    case 1:
                        do{
                            System.out.print("Jenis\t\t: ");
                            String jenis = sc.nextLine();
                            System.out.print("Warna\t\t: ");
                            String warna = sc.nextLine();
                            System.out.print("Merk\t\t: ");
                            String merk = sc.nextLine();
                            System.out.print("Ukuran\t\t: ");
                            String ukuran = sc.nextLine();
                            System.out.print("Harga\t\t: ");
                            double harga = sd.nextInt();
                            System.out.println("");
            
                            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                            System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
                            pilih = sc.next().charAt(0);
                            sc.nextLine();
                            stk.push(p);
                        }
                        while (pilih == 'y');
                        break;
                
                    case 2:
                        stk.pop();
                        break;
                
                    case 3:
                        stk.peek();
                        break;
                
                    case 4:
                        stk.print();
                        break;
                    
                    default:
                        System.out.println("Input yang anda masukkan salah");
                        System.exit(0);

                }if(pilihan == 5){
                    pilih ='t';
                }else{
                    System.out.print("Kembali ke menu Utama (y/t) ");
                    pilih = sc.next().charAt(0);
                }
            }while (pilih == 'y');
        }
    }
    ~~~

### **7.3 Praktikum 2**

### *7.3.1 Langkah-langkah Percobaan*

*Class "Postfix"*

~~~java
package Percobaan;

public class Postfix {
    int n;
    int top;
    char[]stack;
    
    public  Postfix(int total){
        n=total;
        top =-1;
        stack =new char[n];
        push('(');
    }
    public void push(char c){
       top++; 
       stack[top]=c;
    }
    public char pop(){
        char item =stack[top];
        top--;
        return item;
    }
    public boolean IsOperand(char c){
        if((c>= 'A' && c <= 'Z') || (c >= 'a'&& c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.'){ 
            return true;
        }else{
            return false;
        }
    }
    public boolean IsOperator(char c){
        if( c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+'){
            return true;
        }else{
            return false;
        }
    }
    public int derajat(char c){
        switch (c){
            case '^':
                return 3;
            case '%':
                return 2;
            case'/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }
    public String konversi(String Q){
        String P =" ";
        char c;
        for(int i = 0; i < n; i++){
            c =Q.charAt(i);
            if(IsOperand(c)){
                P = P+c;
            }
            if (c == '('){
                push(c);
            }
            if ( c == ')'){
                while( stack[top] != '('){
                    P = P+ pop();
                }
                pop();
            }
            if (IsOperator(c)){
                while (derajat(stack[top]) >=  derajat(c)){
                    P = P+pop();
                }
                push(c);
            }
        }
        return P;
    }
}
~~~

*Main Class "PostfixMain"*

~~~java
package Percobaan;

import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P,Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix : "+ P);
    }
}
~~~

### *7.3.3 Pertanyaan*

1. Perhatikan class Postfix, jelaskan alur kerja method derajat!

    *Pada class "postix", method derajat memiliki alur seperti berikut ini ketika operator tersebut adalah '^' maka akan mereturn nilai 3, jika operator '%','/',' * ' maka akan mereturn nilai 2. dan sedangkan operator '-', '+' maka akan mereturn nilai 1 dengan menggunakan perintah switch case yang telah tersedia.*

2. Apa fungsi kode program berikut?

    ~~~java
    c = Q.charAt(i);
    ~~~

    *Variabel c digunakan untuk menyimpan data char i ke dalam variabel Q dengan menggunakan perintah charAt(i).*

3. Jalankan kembali program tersebut, masukkan ekspresi 3*5^(8-6)%3. Tampilkan hasilnya!

    <img src = "Screenshot (587).png">

4. Pada soal nomor 3, mengapa tanda kurung tidak ditampilkan pada hasil konversi? Jelaskan!

    *Karena ketika terdapat tanda kurung pada ekspresi matematika, maka tanda kurung tersebut akan langsung di pop tanpa dimasukkan kedalam postfix.*

### **7.4 Tugas**

1. Perhatikan dan gunakan kembali kode program pada Praktikum 1. Tambahkan method getMin
pada class Stack yang digunakan untuk mencari dan menampilkan data pakaian dengan harga
terendah dari semua data pakaian yang tersimpan di dalam stack!

    ***Jawab***

    *Class "PakaianTugas1"*

    ~~~java
    package Tugas;
public class PakaianTugas1 {
    String jenis, warna, merk, ukuran;
    double harga;

    PakaianTugas1 (String jenis, String warna, String merk, String ukuran, double harga){
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }
}

 ~~~
    
*Class "StackTugas1"*

    ~~~java
    package Tugas;
public class StackTugas1 {
    int size;
    int top;
    PakaianTugas1 data[];

    public StackTugas1(int size){
        this.size = size;
        data = new PakaianTugas1[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(PakaianTugas1 pkn){
        if (!IsFull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if (!IsEmpty()){
            PakaianTugas1 x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println("");
    }

    public void clear(){
        if (!IsEmpty()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void getMin(){
        double hrgMin = data[0].harga;
        int idn = 0;
        for(int i = 1; i <= top; i++){
            if (hrgMin > data[i].harga){
                idn = i;
                hrgMin = data[i].harga;
            }
        }
        System.out.println("Harga Pakaian Terendah adalah\t: "+data[idn].harga);
        System.out.println("Dengan merk\t\t\t: "+data[idn].merk);
    }
}
    ~~~

*Main Class "StackMainTugas1"*

    ~~~java
   package Tugas;
import java.util.Scanner;

public class StackMainTugas1 {
    public static void main(String[] args) {
        StackTugas1 stk = new StackTugas1(5);
    
        try (Scanner sc = new Scanner(System.in)) {
            try (Scanner sd = new Scanner(System.in)) {
                char pilih;
                do{
                    System.out.println("------------------------------------");
                    System.out.println("             PILIHAN MENU           ");
                    System.out.println("------------------------------------");
                    System.out.println(" 1. Push\n 2. Pop\n 3. Peek\n 4. Print\n 5. Harga Terendah\n");
                    int pilihan;
                    System.out.print("Pilih Menu (masukkan angka 1-4): ");
                    pilihan = sd.nextInt();
                
                    switch (pilihan){
                        case 1:
                            do{
                                System.out.print("Jenis\t\t: ");
                                String jenis = sc.nextLine();
                                System.out.print("Warna\t\t: ");
                                String warna = sc.nextLine();
                                System.out.print("Merk\t\t: ");
                                String merk = sc.nextLine();
                                System.out.print("Ukuran\t\t: ");
                                String ukuran = sc.nextLine();
                                System.out.print("Harga\t\t: ");
                                double harga = sd.nextInt();
                                System.out.println("");
                
                                PakaianTugas1 p = new PakaianTugas1(jenis, warna, merk, ukuran, harga);
                                System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
                                pilih = sc.next().charAt(0);
                                sc.nextLine();
                                stk.push(p);
                            }while (pilih == 'y');
                            break;
                    
                        case 2:
                            stk.pop();
                            break;
                    
                        case 3:
                            stk.peek();
                            break;
                    
                        case 4:
                            stk.print();
                            break;
                    
                        case 5:
                            stk.getMin();
                            break;
                        
                        default:
                            System.out.println("Input yang anda masukkan salah");
                            System.exit(0);
                    }if(pilihan == 5){
                        pilih ='t';
                    }else{
                        System.out.print("Kembali ke menu Utama (y/t) ");
                        pilih = sc.next().charAt(0);
                    }
                }while (pilih == 'y');
            }
        }
    }
~~~
~~~
*Output*
<img src = "Stack1.jpg">
<img src = "Stack2.jpg">
<img src = "Stack3.jpg">

~~~
2. Setiap hari Minggu, Dewi pergi berbelanja ke salah satu supermarket yang berada di area
rumahnya. Setiap kali selesai berbelanja, Dewi menyimpan struk belanjaannya di dalam laci.
Setelah dua bulan, ternyata Dewi sudah mempunyai delapan struk belanja. Dewi berencana
mengambil lima struk belanja untuk ditukarkan dengan voucher belanja.
Buat sebuah program stack untuk menyimpan data struk belanja Dewi, kemudian lakukan juga
proses pengambilan data struk belanja sesuai dengan jumlah struk yang akan ditukarkan dengan
voucher. Informasi yang tersimpan pada struk belanja terdiri dari:

    • Nomor transaksi

    • Tanggal pembelian

    • Jumlah barang yang dibeli

    • Total harga bayar

    Tampilkan informasi struk belanja yang masih tersimpan di dalam stack!

    ***Jawab***

    *Class "Belanja"*

    ~~~java
    package Tugas;

public class Belanja {

    public Belanja(int banyak) {
    }

    public void print() {
    }

    public void push(StrukBelanjaTugas sb) {
    }

    public void peek() {
    }

    public void pop() {
    }

}

    ~~~

*Class "StrukBelanjaTugas"*

    ~~~java
    package Tugas;
public class StrukBelanjaTugas {
    String tanggal, namaBarang;
    int noTransaksi, jmlh, total;

    StrukBelanjaTugas(int nt, String tgl, String nb, int j, int t){
    noTransaksi =nt;
    tanggal =tgl;
    namaBarang =nb;
    jmlh =j;
    total =t;
    }    
}
    ~~~

*Main Class "StrukBelanjaMainTugas"*

    ~~~java
    package Tugas;
import java.util.Scanner;

public class StrukBelanjaMainTugas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try (Scanner sd = new Scanner(System.in)) {
                System.out.println("----------------------------------");
                System.out.println("      History Struk Belanja       ");
                System.out.println("----------------------------------");
                System.out.println();
                System.out.print("Masukkan Banyak Struk\t: ");
                int banyak = sc.nextInt();
                System.out.println();
                Belanja blj = new Belanja(banyak);

                int totalHarga = 0;
                int jml, harga;
                for (int i = 0; i < banyak; i++) {
                System.out.print("Nomor Transaksi\t\t: ");
                int nt =sc.nextInt();
                System.out.print("Tanggal Pembelian\t: ");
                String tanggal =sd.nextLine();
                System.out.print("Nama Barang\t\t: ");
                String nb =sd.nextLine();
                System.out.print("Jumlah Barang\t\t: ");
                jml = sc.nextInt();
                System.out.print("Harga Barang\t\t: ");
                harga = sc.nextInt();
                totalHarga =jml * harga;
                StrukBelanjaTugas sb =new StrukBelanjaTugas(nt, tanggal, nb, jml,harga);
                blj.push(sb);
                System.out.print("Total Harga\t\t: "+ totalHarga);
                System.out.println("\n");
                }

   char pilih;
   do{
                System.out.println("------------------------------------");
                System.out.println("             PILIHAN MENU           ");
                System.out.println("------------------------------------");
                System.out.println(" 1. menampilkan struk teratas\n 2. ambil 5 struk untuk mendapatkan kupon\n 3. lihat sisa struk\n 4. keluar\n");
                
                System.out.print("Pilih Menu (masukkan angka 1-4)");
                int pilihan =sc.nextInt();
                System.out.println("------------------------------------------------");
   
                switch (pilihan){
                    case 1:
                        blj.peek();
                        blj.print();
                        break;
                    case 2:
                        blj.pop();
                        blj.pop();
                        blj.pop();
                        blj.pop();
                        blj.pop();
                        break;
                    case 3:
                        blj.print();
                        break;
                    case 4:
                        System.out.println("Terima Kasih");
                        break;
                    default:
                        System.out.println("Menu yang anda masukkan salah");
                        break;
                }if(pilihan == 4) {
                    pilih = 't';
                }else{
                    System.out.print("Kembali ke menu Utama (y/t) : ");
                    pilih = sc.next().charAt(0);
                }
   }while(pilih == 'y');
            }
        }
    }
}    
~~~~

*Output*
<img src = "Belanja1.jpg">
<img src = "Belanja2.jpg">