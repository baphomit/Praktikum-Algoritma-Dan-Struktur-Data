package Tugas.Tugas4;
class SLLQueue_Tugas4{
    ImplementasiLinkedListQueue head;
    ImplementasiLinkedListQueue tail;

    public boolean IsEmpty(){
        return head == null;
    }

    public void print(){
        if(!IsEmpty()){
            ImplementasiLinkedListQueue tmp = head;
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

    public void peek(){
        if(!IsEmpty()){
            ImplementasiLinkedListQueue tmp = head;
            System.out.println("Antrian paling depan: " + tmp.nim + " " + 
            tmp.nama + " " + tmp.absen + " " + tmp.ipk);
        }else{
            System.out.println("Antrian masing kosong!");
        }
    }

    public void peekRear(){
        if(!IsEmpty()){
            ImplementasiLinkedListQueue tmp = head;
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

    public void Enqueue(String nim, String nama, int absen, double ipk){
        ImplementasiLinkedListQueue ndInput = new ImplementasiLinkedListQueue(nim, nama, absen, ipk, null);
        if(IsEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void Dequeue(){
        if(IsEmpty()){
            System.out.println("Antrian Masih Kosong, tidak dapat dihapus!");
        }else if (head == tail){
            head = tail = null;
        }else{
            ImplementasiLinkedListQueue temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }


    public void peekPosition(String key){
        ImplementasiLinkedListQueue tmp = head;
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

    public void peekAt(int index){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong!");
        }else{
            ImplementasiLinkedListQueue tmp = head;
            for(int i=1; i<index; i++){
                tmp = tmp.next;
            }
            System.out.println("Data Mahasiswa dengan Nomor Antrian " + index + " : " + tmp.nim + " " + 
            tmp.nama + " " + tmp.absen + " " + tmp.ipk);
        }
    }

    public void clear(int jml){
        if(!IsEmpty()){
            head = tail = null;
            jml = 0;
            System.out.println("Antrian Mahasiswa berhasil dikosongkan");
        }else{
            System.out.println("Antrian Mahasiswa Masih kosong");
        }
    }
}
