package Tugas.Tugas4;

class SLLMahasiswa_Tugas4{
    Mahasiswa head;
    Mahasiswa tail;

    public boolean IsEmpty(){
        return head == null;
    }

    public void print(){
        if(!IsEmpty()){
            Mahasiswa tmp = head;
            int sort = 0;
            while(tmp != null){
                System.out.println("Mahasiswa ke-" + sort + " : " + tmp.nim + " " + 
                tmp.nama + " " + tmp.absen + " " + tmp.ipk);
                tmp = tmp.next;
                sort++;
            }
        }else{
            System.out.println("Antrian Masih Kosong!");
        }
    }

    public void antrianTerdepan(){
        if(!IsEmpty()){
            Mahasiswa tmp = head;
            System.out.println("Antrian paling depan: " + tmp.nim + " " + 
            tmp.nama + " " + tmp.absen + " " + tmp.ipk);
        }else{
            System.out.println("Antrian masing kosong!");
        }
    }

    public void antrianTerbelakang(){
        if(!IsEmpty()){
            Mahasiswa tmp = head;
            while(tmp != null){
                if(tmp == tail){
                    System.out.println("Antrian paling belakang: " + tmp.nim + " " + 
                    tmp.nama + " " + tmp.absen + " " + tmp.ipk);
                }
                tmp = tmp.next;
            }
        }else{
            System.out.println("Antrian masih kosong!");
        }
    }

    public void addData(String nim, String nama, int absen, double ipk){
        Mahasiswa ndInput = new Mahasiswa(nim, nama, absen, ipk, null);
        if(IsEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void searchDataOfIndex(int index){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong!");
        }else{
            Mahasiswa tmp = head;
            for(int i=1; i<index; i++){
                tmp = tmp.next;
            }
            System.out.println("Data Mahasiswa dengan Nomor Antrian " + index + " : " + tmp.nim + " " + 
            tmp.nama + " " + tmp.absen + " " + tmp.ipk);
        }
    }

    public void searchDataOfNim(String key){
        Mahasiswa tmp = head;
        int index = 0;
        while (tmp != null && (!(tmp.nim.equals(key)))){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            System.out.println("Antrian Kosong!");
        }else{
            System.out.println("Mahasiswa dengan NIM: " + key + " berada pada index ke - " + index);
        }
        System.out.println("Data Mahasiswa: " + tmp.nim + " " + 
        tmp.nama + " " + tmp.absen + " " + tmp.ipk);
    }

    public void remove(){
        if(IsEmpty()){
            System.out.println("Antrian Masih Kosong, tidak dapat dihapus!");
        }else if (head == tail){
            head = tail = null;
        }else{
            Mahasiswa temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
}
