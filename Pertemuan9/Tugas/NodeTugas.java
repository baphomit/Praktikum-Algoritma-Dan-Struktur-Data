package Tugas;
public class NodeTugas{
    int data;
    NodeTugas next;

    public NodeTugas (int data, NodeTugas berikutnya){
        this.data = data;
        this.next = berikutnya;
    }
}

class SingleLinkedList{
    NodeTugas head;
    NodeTugas tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            NodeTugas tmp = head;
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
        NodeTugas ndInput = new NodeTugas(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input){
        NodeTugas ndInput = new NodeTugas(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input){
        NodeTugas ndInput = new NodeTugas(input, null);
        NodeTugas temp = head;
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
    
    public void insertBefore(int key, int input){
        NodeTugas ndInput = new NodeTugas(input, null);
        NodeTugas temp = head;
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
    
    public void insertAt(int index, int input){
        if(index < 0){
            System.out.println("indeks salah");
        }else if(index == 0){
            addFirst(input);
        }else{
            NodeTugas temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new NodeTugas(input, temp.next);
            if(temp.next.next == null) tail = temp.next;
        }
    }

    public int gedData(int index){
        NodeTugas tmp = head;
        for(int i=0; i<index; i++){
            tmp = tmp.next; 
        }
        return tmp.data;
    }

    public int indexOf(int key){
        NodeTugas tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }

        if(tmp == null){
            return -1;
        }else{
            return index;
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus");
        }else if(head == tail){
            head = tail = null;
        }else{
            NodeTugas temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        }else{
            NodeTugas temp = head;
            while(temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                }else if(temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        }else{
            NodeTugas temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }

}

class SLLMain{
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
        singLL.insertBefore(890, 100);
        singLL.print();

        System.out.println("Data pada indekx ke-1 = " + singLL.gedData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL.indexOf(890));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}