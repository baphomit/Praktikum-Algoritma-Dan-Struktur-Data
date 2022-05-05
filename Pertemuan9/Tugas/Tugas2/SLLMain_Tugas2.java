package Tugas.Tugas2;
class SLLMain_Tugas2{
    public static void main(String[] args) {
        SingleLinkedList_Tugas2 ilusSLL = new SingleLinkedList_Tugas2();
        ilusSLL.print();
        ilusSLL.addFirst('b');
        ilusSLL.print();
        ilusSLL.addLast('d');
        ilusSLL.print();
        ilusSLL.insertAfter('d', 'e');
        ilusSLL.print();
        ilusSLL.insertBefore('d', 'c');
        ilusSLL.print();
        ilusSLL.insertAt(0, 'a');
        ilusSLL.print();
    }
}