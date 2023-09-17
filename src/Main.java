// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.printLinkedList();

        sll.insertLinkedList(1,0);
        sll.insertLinkedList(2,0);
        sll.insertLinkedList(3,0);
        sll.insertLinkedList(4,0);
        sll.insertLinkedList(5,100);

        sll.printLinkedList();

    }

}