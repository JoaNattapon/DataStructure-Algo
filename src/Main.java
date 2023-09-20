// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.printLinkedList();

        sll.insertLinkedList(1,0);
        sll.insertLinkedList(63,1);
        sll.insertLinkedList(3,2);
        sll.insertLinkedList(4,3);
        sll.insertLinkedList(5,4);
        sll.insertLinkedList(2,5);
        sll.insertLinkedList(2,6);
        sll.insertLinkedList(2,7);
        sll.insertLinkedList(63,8);

        sll.printLinkedList();

        sll.searchByValue(63);
        System.out.println("----------------------  After deleting the Node  ------------------------");
        sll.deleteNode(8);
        sll.deleteNode(7);
        sll.deleteNode(5);
        sll.deleteNode(4);
//        sll.deleteNode(3);
//        sll.deleteNode(2);
//        sll.deleteNode(1);
//        sll.deleteNode(0);
//        sll.deleteNode(0);
//        sll.deleteNode(3);
//        sll.deleteAllNodes();

        sll.printLinkedList();
        sll.getSize();

    }

}