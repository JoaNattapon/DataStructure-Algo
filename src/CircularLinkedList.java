public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    public int getHead() {
        return head.value;
    }

    public int getNextHead() {
        return head.nextRef.value;
    }

    public Node createCircularLinkedList(int value) {

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        newNode.nextRef = newNode;
        size++;

        return head;
    }


}
