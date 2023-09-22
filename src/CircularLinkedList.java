public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    public Node createCircularLinkedList(int value) {

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size++;

        return newNode;
    }
}
