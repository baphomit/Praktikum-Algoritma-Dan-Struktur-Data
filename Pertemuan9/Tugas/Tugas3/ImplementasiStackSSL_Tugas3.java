package Tugas.Tugas3;
class ImplementasiStackSSL_Tugas3{
    ImplementasiStack head;
    ImplementasiStack tail;
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void print(){
        if (!isEmpty()){
            ImplementasiStack tmp = head;
            System.out.println("");
            while (tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("Stack Masih Kosong!");
        }
    }

    public void peek(){
        if(!isEmpty()){
            ImplementasiStack tmp = head;
            System.out.println("Isi Stack Teratas : " + tmp.data);
        }else{
            System.out.println("Stack Masing Kosong!");
        }
    }

    public void pushAwal(String input){
        ImplementasiStack ndInput = new ImplementasiStack(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
}
