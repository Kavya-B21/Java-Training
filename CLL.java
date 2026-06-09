public class CLL {
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        System.out.println("Circular Linked List:");
        cll.display();
        // cll.delete(50);
        // cll.display();
    }
}
class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {

    Node2 head = null;
    Node2 tail = null;
    
    void insert(int data) {
        Node2 newNode = new Node2(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // circular
        }
    }

    // Display
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node2 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }
	
    void delete(int key) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (head == tail && head.data == key) {
        head = null;
        tail = null;
        return;
    }
    if (head.data == key) {
        head = head.next;
        tail.next = head;
        return;
    }
    Node2 prev = head;
    Node2 current = head.next;

    while (current != head) {

        if (current.data == key) {

            if (current == tail) {
                tail = prev;
                tail.next = head;
            } else {
                prev.next = current.next;
            }

            return;
        }

        prev = current;
        current = current.next;
    }

    System.out.println("\nValue not found");
    }

 }