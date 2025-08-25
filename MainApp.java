// MainApp.java
public class MainApp {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insertions
        dll.insertAtBeginning(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtPosition(15, 2);
        dll.printList();

    
        dll.deleteFromBeginning();
        dll.printList(); 

        dll.deleteFromEnd();
        dll.printList(); 

        dll.deleteFromPosition(2);
        dll.printList(); 

        // Search
        dll.search(15);
        dll.search(100);
    }
}
