package Tugas.Tugas2;
class SingleLinkedList_Tugas2{
    IlustrasiLinkedList head;
    IlustrasiLinkedList tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            IlustrasiLinkedList tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(char input){
        IlustrasiLinkedList ndInput = new IlustrasiLinkedList(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(char input){
        IlustrasiLinkedList ndInput = new IlustrasiLinkedList(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(char key, char input){
        IlustrasiLinkedList ndInput = new IlustrasiLinkedList(input, null);
        IlustrasiLinkedList temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }
    
    public void insertBefore(char key, char input){
        IlustrasiLinkedList ndInput = new IlustrasiLinkedList(input, null);
        IlustrasiLinkedList temp = head;
        do{
            if((temp.data == key) && (temp == head)){
                this.addFirst(input);
                break;
            }else if (temp.next.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }
    public void insertAt(int index, char input){
        if(index < 0){
            System.out.println("indeks salah");
        }else if(index == 0){
            addFirst(input);
        }else{
            IlustrasiLinkedList temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new IlustrasiLinkedList(input, temp.next);
            if(temp.next.next == null) tail = temp.next;
        }
    }
}
