public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    // Create SinglyLinkedList
    public void createSinglyLinkedList(int value) {
        Node myNode = new Node(value);
        if (head == null) {
            head = myNode;
        } else {
            tail.nextRef = myNode;
        }
        tail = myNode;
        size++;
    }

    // Insert SinglyLinkedList
    public void insertLinkedList(int value, int location) {
        Node myNode = new Node(value);

        if (location < 0) {
            System.out.println("Invalid location.");
        }

        if (location == 0 || head == null) {
            myNode.nextRef = head;
            head = myNode;
            if (tail == null) {
                tail = myNode;
            }
        }else {
            Node current = head;
            int index = 0;

            while (index < location - 1 && current.nextRef != null) {
                current = current.nextRef;
                index++;
            }

            myNode.nextRef = current.nextRef;
            current.nextRef = myNode;

            if (current == tail) {
                tail = myNode;
            }
        }
        size++;
    }

    // Print all element in LinkedList
    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.nextRef;
        }
        System.out.println("null");
    }

    // Search for specific value in LinkedList
    public void searchByValue(int value) {

        Node tempNode = head;
        for ()
    }


}
