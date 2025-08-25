// DoublyLinkedList.java
public class DoublyLinkedList {
    private Node head;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at a given position (1-based index)
    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete from beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    // Delete from a given position (1-based index)
    public void deleteFromPosition(int position) {
        if (position <= 0 || head == null) {
            System.out.println("Invalid operation!");
            return;
        }
        if (position == 1) {
            deleteFromBeginning();
            return;
        }
        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Search for a value
    public boolean search(int key) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found " + key + " at position " + pos);
                return true;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println(key + " not found in the list.");
        return false;
    }

    // Print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
