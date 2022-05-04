package Praktikum1;
class SingleLinkedList{
    NodePrak1 head;
    NodePrak1 tail;

    public boolean IsEmpty(){
        return head == null;
    }

    public void print(){
        if(!IsEmpty()){
            NodePrak1 tmp =head;
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

    public void addFirst(int input){
        NodePrak1 ndInput = new NodePrak1(input, null);
        if(IsEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input){
        NodePrak1 ndInput = new NodePrak1(input, null);
        if(IsEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input){
        NodePrak1 ndInput = new NodePrak1(input, null);
        NodePrak1 temp = head;
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

    public void insertAt(int index, int input){
        if(index < 0){
            System.out.println("indeks salah");
        }else if(index == 0){
            addFirst(input);
        }else{
            NodePrak1 temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new NodePrak1(input, temp.next);
            if(temp.next.next == null) tail = temp.next;
        }
    }
}
