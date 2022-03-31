package Tugas5;
public class tiketService {
    tiket tikets [] = new tiket[4];
    int index;
    

    void tambah(tiket t){
        if(index <tikets.length){
            tikets[index] = t;
            index++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampilAll(){
        for(tiket t : tikets){
            t.tampilAll();
        }
    }

    void bubbleSort(){
        for(int i=0; i<tikets.length-1; i++){
            for(int j=1; j<tikets.length-i; j++){
                if(tikets[j].harga < tikets[j-1].harga){
                    //proses swap bubble short
                    tiket tmp = tikets[j];
                    tikets[j] = tikets[j-1];
                    tikets[j-1] = tmp;
                }
            }
        }
    }

   void selectionShort(){
        for(int i=0; i<tikets.length-1; i++){
            int indexMin = i;
            for(int j=i+1; j<tikets.length; j++){
                if(tikets[j].harga > tikets[indexMin].harga){
                    indexMin = j;
                }
            }

            tiket tmp = tikets[indexMin];
            tikets[indexMin] = tikets[i];
            tikets[i] = tmp;
        }
    }
}
